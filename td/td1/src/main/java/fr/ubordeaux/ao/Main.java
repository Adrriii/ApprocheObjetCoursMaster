package fr.ubordeaux.ao;

public class Main {

    private static final int MAX = 16000000;

    public static void main(String[] args) {
        ContactSet contactSet = new ContactSet();

        Town talence = new Town("Talence", 33405);
        Address address = new Address(351, "Cours de la libération", talence);
        Contact newContact = new Contact("John", "Do", address);
        contactSet.addContact(newContact);

        System.out.println(SearchEngine.search(contactSet, "john").size()+" contacts found");
    }
}
