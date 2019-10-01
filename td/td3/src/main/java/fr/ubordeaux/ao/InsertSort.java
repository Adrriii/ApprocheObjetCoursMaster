package td3.src.main.java.fr.ubordeaux.ao;

/**
 *
 * @author Adri
 */
public class InsertSort implements SortAlgorithm {

    public String[] sort(String[] unsorted) {
        String[] sorted = new String[unsorted.length];

        sorted[0] = unsorted[0];

        for (int i = 1; i < unsorted.length; i++) {
            int insert = 0;

            while (sorted[insert] != null && Compare.compare(sorted[insert], unsorted[i]) < 0) {
                insert++;
            }

            boolean replace = false;
            String current = sorted[insert];
            String last = sorted[insert];
            
            while (insert < unsorted.length) {
                if (!replace) {
                    sorted[insert] = unsorted[i];
                    replace = true;
                } else {
                    current = sorted[insert];
                    sorted[insert] = last;
                }
                last = current;
                insert++;
            }
        }

        return sorted;
    }
}
