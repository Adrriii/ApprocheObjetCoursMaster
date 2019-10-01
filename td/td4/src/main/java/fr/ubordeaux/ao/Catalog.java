package td4.src.main.java.fr.ubordeaux.ao;

import java.util.Set;

public interface Catalog {

    public int size();

    public Set<Reference> getReferences();

    public Reference findReferenceById(String id);

    public void addReference(Reference reference);

    public void removeReference(Reference reference);
}
