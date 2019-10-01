package td3.src.main.java.fr.ubordeaux.ao;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Adri
 */
public class SortBenchmark {

    private ArrayList<SortAlgorithm> algorithms;

    public SortBenchmark() {
        algorithms = new ArrayList<>();
    }

    public void addAlgorithm(SortAlgorithm algo) {
        algorithms.add(algo);
    }

    public void bench() {
        int strLength = 7;
        int n = 100;
        String[] unsorted = new String[n];

        for (int nstring = 0; nstring < n; nstring++) {
            unsorted[nstring] = randomString(strLength);
        }

        System.out.println("Running benchmark with " + unsorted.length + " " + unsorted[0].getClass().getSimpleName() + ".");

        algorithms.forEach((algo) -> {
            long start = System.nanoTime();
            String[] sorted = algo.sort(unsorted);
            long finish = System.nanoTime();

            System.out.println(algo.getClass().getSimpleName() + " finished in " + (finish - start) + " ns");
        });

    }

    // by Eugen Paraschiv https://www.baeldung.com/author/eugen/
    // https://www.baeldung.com/java-random-string
    public String randomString(int n) {
        byte[] array = new byte[n]; // length is bounded by n
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        return generatedString;
    }
}
