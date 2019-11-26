package fr.ubordeaux.ao.infrastructure.json;

import java.util.Set;

import fr.ubordeaux.ao.domain.model.BasketRepository;
import fr.ubordeaux.ao.domain.exception.ReferenceManagementException;
import fr.ubordeaux.ao.domain.model.Basket;
import fr.ubordeaux.ao.domain.model.CommandLine;

import org.json.JSONObject;

public class BasketRepositoryImpl implements BasketRepository {

    JSONObject basket;

    @Override
    public Basket getBasket() {
        Basket res = new Basket();
        
        return res;
    }

    @Override
    public void setBasket(Basket basket) {
        this.basket = new JSONObject();

        for(CommandLine cl : basket.getCommandLines()) {
            this.basket.append(cl.GetReferenceId(), cl.GetQuantity());
        }

    }

    @Override
    public void unsetBasket() {
        this.basket = null;
    }

}