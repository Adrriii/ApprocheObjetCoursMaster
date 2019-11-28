package fr.ubordeaux.ao.infrastructure.json;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import fr.ubordeaux.ao.domain.exception.ReferenceManagementException;
import fr.ubordeaux.ao.domain.model.Catalog;
import fr.ubordeaux.ao.domain.model.Reference;
import fr.ubordeaux.ao.domain.type.Price;

import org.json.JSONObject;

public class CatalogImpl implements Catalog {
    private JSONObject catalog;

    public CatalogImpl() {
        catalog = new JSONObject();
    }

    public int size() {
        return this.catalog.keySet().size();
    }

    public Set<Reference> getReferences() {
        Set<Reference> result = new HashSet<Reference>();
        
        Iterator<String> keys = this.catalog.keys();
        while(keys.hasNext()) {
            result.add(this.findReferenceById(keys.next()));
        }

        return result;
    }

    public Reference findReferenceById(String id) {
        if (!this.catalog.has(id)) throw new ReferenceManagementException("cannot find Reference, id unknown !");
        JSONObject refJson = this.catalog.getJSONObject(id);
        Reference ref = new Reference(id, refJson.getString("name"), refJson.getString("description"), new Price(Integer.parseInt(refJson.getString("price"))));
        return ref;
    }

    public void addReference(Reference reference) {
        JSONObject ref = new JSONObject();
        ref.put("name", reference.getName());
        ref.put("description", reference.getDescription());
        ref.put("price", reference.getBasePrice().getPrice());
        
        this.catalog.put(reference.getId(), ref);
    }

    public void removeReference(Reference reference) {
        this.catalog.remove(reference.getId());
    }

    public void save() {
        try {
            FileOutputStream stream = new FileOutputStream(new File("j.json"));
            stream.write(this.catalog.toString().getBytes());
            stream.close();
        } catch (IOException e) {
            
        }
    }
}