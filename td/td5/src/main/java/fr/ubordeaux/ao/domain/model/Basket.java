package fr.ubordeaux.ao.domain.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import fr.ubordeaux.ao.domain.exception.ReferenceManagementException;

public class Basket {
    Set<CommandLine> commandLines; 

    boolean confirmed;

    public Basket() {
        commandLines = new HashSet<CommandLine>();
        confirmed = false;
    }

    public void addReference(Reference reference, int quantity) {
        if(confirmed) throw new ReferenceManagementException("cannot alter confirmed basket");
        if(reference == null) throw new ReferenceManagementException("cannot add null reference to basket");

        for(CommandLine compare : this.commandLines) {
            if(compare.compareReference(reference)) {
                throw new ReferenceManagementException("cannot add existing reference to basket");
            }
        }
        
        this.commandLines.add(new CommandLine(reference, quantity));
    }

    public void deleteReference(Reference reference) {
        if(confirmed) throw new ReferenceManagementException("cannot alter confirmed basket");
        
        Iterator<CommandLine> iterator = this.commandLines.iterator();
        while(iterator.hasNext()) {
            CommandLine current = iterator.next();

            if(current.compareReference(reference)) {
                commandLines.remove(current);
                break;
            }
        }
    }

    public int GetAmount() {
        int total = 0;
        for(CommandLine commandLine : this.commandLines) {
            total += commandLine.GetAmount();
        }
        return total;
    }

    public void confirm() {
        confirmed = true;
    }
}