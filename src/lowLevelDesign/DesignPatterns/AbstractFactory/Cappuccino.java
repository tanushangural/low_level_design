package lowLevelDesign.DesignPatterns.AbstractFactory;

public class Cappuccino extends Coffee{
    public Cappuccino(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void boil() {

    }

    @Override
    public void brew() {

    }
}
