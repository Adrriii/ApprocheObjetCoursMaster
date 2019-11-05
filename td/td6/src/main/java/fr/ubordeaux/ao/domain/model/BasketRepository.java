package fr.ubordeaux.ao.domain.model;

public interface BasketRepository {
    public Basket getBasket();
    public void setBasket(Basket basket);
    public void unsetBasket();
}