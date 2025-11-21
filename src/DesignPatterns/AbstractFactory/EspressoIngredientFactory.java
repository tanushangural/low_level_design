package DesignPatterns.AbstractFactory;

public class EspressoIngredientFactory implements IngredientFactory{
    @Override
    public Bean getBean() {
        return new FrenchBean();
    }

    @Override
    public Sugar getSugar() {
        return new RegularSugar();
    }

    @Override
    public Milk getMilk() {
        return new CowMilk();
    }
}
