package fr.ubordeaux.ao;

import java.util.HashSet;
import java.util.Set;

public class SearchEngine {
    
    static public Set<Contact> search(ContactSet contacts, String search) {
        Set<Contact> contacts_set = contacts.getContactSet(0, contacts.size());
        Set<Contact> results = new HashSet<Contact>();

        for(Contact contact : contacts_set) {
            if(contact.getFirstName().toLowerCase().equals(search.toLowerCase())) {
                results.add(contact);
                continue;
            }
            if(contact.getSecondName().toLowerCase().equals(search.toLowerCase())) {
                results.add(contact);
                continue;
            }
        }

        return results;
    }

}