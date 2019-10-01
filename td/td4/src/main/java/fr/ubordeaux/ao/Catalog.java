package td4.src.main.java.fr.ubordeaux.ao;

import java.util.ArrayList;
import java.util.Set;

public interface Catalog {
    
    public ArrayList<Catalog> getSubCatalogs();
    
    public String getName();

    public int size();

    public Set<Reference> getReferences();

    public Set<Reference> getAllReferences();

    public Reference findReferenceById(String id);

    public void addReference(Reference reference);

    public void removeReference(Reference reference);
}
