package fr.ubordeaux.ao.infrastructure.inmemory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import fr.ubordeaux.ao.domain.model.BasketRepository;
import fr.ubordeaux.ao.domain.exception.ReferenceManagementException;
import fr.ubordeaux.ao.domain.model.Basket;

public class BasketRepositoryImpl implements BasketRepository {
    private Basket basket;

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public void unsetBasket() {
        basket = null;
    }

}