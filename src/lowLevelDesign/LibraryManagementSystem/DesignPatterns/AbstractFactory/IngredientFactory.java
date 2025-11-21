package lowLevelDesign.LibraryManagementSystem.DesignPatterns.AbstractFactory;

public interface IngredientFactory {
    Bean getBean();
    Sugar getSugar();
    Milk getMilk();
}
