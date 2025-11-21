package lowLevelDesign.LibraryManagementSystem.DesignPatterns.AbstractFactory;

public abstract class Coffee {
    private final Bean bean;
    private final Sugar sugar;
    private final Milk milk;
    private final IngredientFactory ingredientFactory;

    protected Coffee(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.bean = ingredientFactory.getBean();
        this.milk = ingredientFactory.getMilk();
        this.sugar = ingredientFactory.getSugar();
    }

    public abstract void boil();
    public abstract void brew();
}
