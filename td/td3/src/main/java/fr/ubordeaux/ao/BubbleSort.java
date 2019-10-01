package td3.src.main.java.fr.ubordeaux.ao;

/**
 *
 * @author Adri
 */
public class BubbleSort implements SortAlgorithm {

    public String[] sort(String[] unsorted) {
        String[] sorted = unsorted.clone();
        boolean complete = false;
        
        while(!complete) {
            complete = true;
            for(int i = 0; i+1 < sorted.length; i++) {
                if(Compare.compare(sorted[i], sorted[i+1]) > 0) {
                    String temp = sorted[i+1];
                    sorted[i+1] = sorted[i];
                    sorted[i] = temp;
                    complete = false;
                }
            }
        }

        return sorted;
    }
}
