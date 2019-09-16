package fr.ubordeaux.ao;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Account {
    private int balance;
    private String id; // On peut utiliser un compteur d'ID static à incrémenter pour éviter d'allouer deux fois le meme ID
    private String name;
    private Set<Transaction> transactions;

    public Account(String id, String name) {
        this.balance = 0;
        transactions = new HashSet<Transaction>();
    }

    public double getBalance() {
        return balance;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        this.balance += transaction.getAmount();
    }

    // Ceci est possible, mais si l'on souhaite modifier le prototype du constructeur utilisé, il faudra aussi maintenir ce code.
    public void addTransaction(String titre, int montant) {
        addTransaction(new Transaction(titre, montant));
    }

    public void removeTransaction(String titre, int montant, Date date) {
        
        Iterator<Transaction> iter = this.transactions.iterator();
        
        // Supprime les transactions identiques ; Peut être modifié pour s'arrêter à la première
        while(iter.hasNext()) {
            Transaction transaction = iter.next();
            
            // Supprimer une transaction dont les critères correspondent
            if(transaction.getAmount() == montant
               && transaction.getDate().equals(date)
               && transaction.getTitle().equals(titre)) {
                iter.remove();
            }
        }
    }
    
    public Set<Transaction> getTransactionSince(Date date) {
        HashSet<Transaction> out = new HashSet<>();
        
        // Remplir le set de retour par des copies des transactions
        this.transactions.forEach((transaction) -> {
            if(transaction.getDate().after(date)) {
                // Problème: On ne peut pas instancier à une date, elle est automatiquement mise à la date actuelle.
                // Il faudrait une redéfinition du constructeur le permettant.
                out.add(new Transaction(transaction.getTitle(),transaction.getAmount()));
            }
        });
        
        return out;
    }


    @Override
    public boolean equals(Object other) {
        if (other instanceof Account) {
            Account otherAccount = (Account) other;
            return this.id.compareTo(otherAccount.id) == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.id);
    }

    @Override
    public String toString() {
        return "Account "+this.name+" (id="+this.id+"), balance = "+this.balance/100f;
    }
    
}