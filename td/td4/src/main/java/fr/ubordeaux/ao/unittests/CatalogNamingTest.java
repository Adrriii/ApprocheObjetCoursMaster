package td4.src.main.java.fr.ubordeaux.ao.unittests;

import td4.src.main.java.fr.ubordeaux.ao.CatalogImpl;
import td4.src.main.java.fr.ubordeaux.ao.ReferenceManagementException;


/**
 *
 * @author Adri
 */
public class CatalogNamingTest implements UnitTest {

    @Override
    public int run() throws ReferenceManagementException {
        try {
            CatalogImpl catalog = new CatalogImpl("tes");
            catalog = new CatalogImpl("testtttttt");
        } catch(ReferenceManagementException e) {
            return 0;
        }
        try {
            CatalogImpl catalog = new CatalogImpl("te");
            catalog = new CatalogImpl("testttttttt");
            catalog = new CatalogImpl("Test");
            catalog = new CatalogImpl("test0");
            return 0;
        } catch(ReferenceManagementException e) {
            return 1;
        }
    }

}
