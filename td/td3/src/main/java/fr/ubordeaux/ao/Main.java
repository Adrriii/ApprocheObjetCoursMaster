package td3.src.main.java.fr.ubordeaux.ao;

/**
 *
 * @author Adri
 */
public class Main {
    static public void main(String[] args) {
        SortBenchmark benchmark = new SortBenchmark();
        
        InsertSort insertSort = new InsertSort();
        BubbleSort bubbleSort = new BubbleSort();
        
        benchmark.addAlgorithm(insertSort);
        benchmark.addAlgorithm(bubbleSort);
        
        benchmark.bench();
    }
}
