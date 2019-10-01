package td4.src.main.java.fr.ubordeaux.ao.unittests;

import td4.src.main.java.fr.ubordeaux.ao.CatalogImpl;
import td4.src.main.java.fr.ubordeaux.ao.ReferenceManagementException;


/**
 *
 * @author Adri
 */
public class SubCatalogNamingTest implements UnitTest {

    @Override
    public int run() throws ReferenceManagementException {
        CatalogImpl catalog = new CatalogImpl("test");
        
        catalog.addCatalog(new CatalogImpl("testName"));
        
        try {
            catalog.addCatalog(new CatalogImpl("testName"));
            return 0;
        } catch(ReferenceManagementException e) {
            return 1;
        }
    }

}
