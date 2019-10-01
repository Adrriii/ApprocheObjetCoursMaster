package td4.src.main.java.fr.ubordeaux.ao.unittests;

import java.util.ArrayList;

/**
 *
 * @author Adri
 */
public class RunTests {

    static ArrayList<UnitTest> tests;
    
    public static void main(String[] args) {
        
        tests = new ArrayList<>();
        
        tests.add(new CatalogNamingTest());
        tests.add(new SubCatalogNamingTest());
        
        tests.forEach((test) -> {
            if(test.run() != 1) {
                System.out.println("Failed "+test.getClass().getSimpleName());
            } else {
                System.out.println("Success "+test.getClass().getSimpleName());
            }
        });
    }
}
