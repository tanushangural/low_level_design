package lowLevelDesign.LibraryManagementSystem.DesignPatterns.Factory;

public class CoffeeServer {
    public final AbstractFactory abstractFactory;

    public CoffeeServer(AbstractFactory factory) {
        this.abstractFactory = factory;
    }
    public Coffee serve(String coffeeType) {

//        Coffee coffee = null;
//        if(coffeeType.equals("Cappuccino")) {
//            coffee = new Cappuccino();
//        } else if(coffeeType.equals("Espresso")) {
//            coffee = new Espresso();
//        }

//        Coffee coffee = new CoffeeFactory().getCoffee(coffeeType);

        Coffee coffee = this.abstractFactory.getCoffee(coffeeType);
        coffee.boil();
        coffee.brew();
        return coffee;
    }
}
/*
*
* Creational Responsibility of if there mapping needs to be done like above input coffeetype and different type of object
* Factory Pattern can used here to separate out this logic
* */