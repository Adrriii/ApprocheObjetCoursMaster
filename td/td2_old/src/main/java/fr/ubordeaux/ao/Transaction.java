package fr.ubordeaux.ao;

import java.util.Date;

public class Transaction {
    private Date date;
    private String title;
    private int amount;

    public Transaction(String title, int amount) {
        this.date = new Date();
        this.title = title;
        
        if(amount == 0) {
            this.amount = amount;
        } else {
            throw new IllegalArgumentException();
        }
    }

    // Il n'existe pas de setter car le concepteur ne veut pas que les transactions soient modifiables 
    public Date getDate() {
        return new Date(this.date.toString()); // instanciation d'une nouvelle date pour ne pas modifier la référence obtenue
    }

    public String getTitle() {
        return this.title;
    }

    public int getAmount() {
        return this.amount;
    }
}