package lowLevelDesign.DesignPatterns.AbstractFactory;

public interface IngredientFactory {
    Bean getBean();
    Sugar getSugar();
    Milk getMilk();
}
