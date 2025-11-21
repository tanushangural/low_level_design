package DesignPatterns.AbstractFactory;

public class Espresso extends Coffee{

    public Espresso(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
    @Override
    public void boil() {

    }

    @Override
    public void brew() {

    }
}
