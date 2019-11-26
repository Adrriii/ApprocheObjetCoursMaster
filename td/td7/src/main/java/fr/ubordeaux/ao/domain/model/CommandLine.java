package fr.ubordeaux.ao.domain.model;

import fr.ubordeaux.ao.domain.exception.ReferenceManagementException;

public class CommandLine {
    private Reference reference;
    private int quantity;

    public CommandLine(Reference reference, int quantity) {
        this.setReference(reference);
        this.setQuantity(quantity);
    }

    private void setReference(Reference reference) {
        if (reference == null) throw new ReferenceManagementException("cannot create command line with null reference");
        this.reference = reference;
    }

    private void setQuantity(int quantity) {
        if (quantity < 0) throw new ReferenceManagementException("cannot create command line with negative quantity");
        this.quantity = quantity;
    }

    public boolean compareReference(Reference compare) {
        return this.reference.equals(compare);
    }

    public int GetAmount() {
        return this.reference.getBasePrice().getPrice() * this.quantity;
    }

    public int GetQuantity() {
        return this.quantity;
    }

    public String GetReferenceId() {
        return this.reference.getId();
    }
}