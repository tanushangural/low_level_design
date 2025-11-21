package lowLevelDesign.LibraryManagementSystem.DesignPatterns.Factory;

public class CoffeeFactory implements AbstractFactory{

    public Coffee getCoffee(String coffeeType) {
        Coffee coffee = null;
        if(coffeeType.equals("Cappuccino")) {
            coffee = new Cappuccino();
        } else if(coffeeType.equals("Espresso")) {
            coffee = new Espresso();
        } else if(coffeeType.equals("Robusta")) {
            coffee = new Robusta();
        }
        return coffee;
    }
}
