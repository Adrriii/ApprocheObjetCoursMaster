package fr.ubordeaux.ao;

import java.util.HashSet;
import java.util.Set;

public class TownSet {

    private Set<Town> townSet;

    public TownSet() {
        townSet = new HashSet<Town>();

        TownFactory factory = new TownFactory();

        Town next = factory.getNextTown();
        while(next != null) {
            townSet.add(next);
            next = factory.getNextTown();
        }

        System.out.println(townSet.size()+ " towns initialized.");
    }
}