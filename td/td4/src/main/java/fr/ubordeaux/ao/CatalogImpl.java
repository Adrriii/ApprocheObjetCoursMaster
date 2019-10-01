package td4.src.main.java.fr.ubordeaux.ao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CatalogImpl implements Catalog {

    private String name;
    private ArrayList<Catalog> catalogs;
    private Map<String, Reference> references;

    public CatalogImpl(String name) {
        this.name = name;
        catalogs = new ArrayList<>();
        references = new HashMap<>();
    }

    @Override
    public int size() {
        return references.size();
    }

    @Override
    public Set<Reference> getReferences() {
        Set<Reference> result = new HashSet<Reference>();
        result.addAll(references.values());
        return result;
    }

    @Override
    public Set<Reference> getAllReferences() {
        Set<Reference> result = getReferences();
        catalogs.forEach((catalog) -> {
            result.addAll(catalog.getAllReferences());
        });
        return result;
    }

    @Override
    public Reference findReferenceById(String id) {
        if (!references.containsKey(id)) {
            throw new ReferenceManagementException("cannot find Reference, id unknown !");
        }
        return references.get(id);
    }

    @Override
    public void addReference(Reference reference) {
        references.put(reference.getId(), reference);
    }

    @Override
    public void removeReference(Reference reference) {
        references.remove(reference.getId());
    }
    
    public void addCatalog(Catalog newCatalog) throws ReferenceManagementException {
        for(Catalog catalog : catalogs) {
            if(catalog.getName().equals(newCatalog.getName())) {
                throw new ReferenceManagementException("Cannot add catalog with same name.");
            }
        }
        
        catalogs.add(newCatalog);
    }

    @Override
    public ArrayList<Catalog> getSubCatalogs() {
        return catalogs;
    }

    @Override
    public String getName() {
        return name;
    }
}
