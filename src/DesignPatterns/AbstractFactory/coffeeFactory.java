package DesignPatterns.AbstractFactory;

public class coffeeFactory {
    public Coffee getCoffee(String coffeeType) {
        Coffee coffee = null;
        if(coffeeType.equals("Cappuccino")) {
            coffee = new Cappuccino(new CappuccinoIngredientFactory());
        }
        else if(coffeeType.equals("Espresso")) {
            coffee = new Espresso(new EspressoIngredientFactory());
        }
        return coffee;
    }
}
/*

Coffee ->

 */
