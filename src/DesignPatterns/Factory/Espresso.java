package DesignPatterns.Factory;

public class Espresso implements Coffee{
    @Override
    public void brew() {
        System.out.println("Brewing Espresso");
    }

    @Override
    public void boil() {
        System.out.println("Boiling Espresso");
    }
}
