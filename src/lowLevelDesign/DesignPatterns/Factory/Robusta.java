package lowLevelDesign.DesignPatterns.Factory;

public class Robusta implements Coffee{
    @Override
    public void brew() {
        System.out.println("Brewing Robusta");
    }

    @Override
    public void boil() {
        System.out.println("Boiling Robusta");
    }
}
