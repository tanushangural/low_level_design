package lowLevelDesign.DesignPatterns.Factory;

public class Cappuccino implements Coffee{
    @Override
    public void brew() {
        System.out.println("Brewing Cappuccino");
    }

    @Override
    public void boil() {
        System.out.println("Boiling Cappuccino");
    }
}
