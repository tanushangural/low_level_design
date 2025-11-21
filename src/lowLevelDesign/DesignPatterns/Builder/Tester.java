package lowLevelDesign.DesignPatterns.Builder;

public class Tester {

    public static void main(String[] args) {
        User user = new User.Builder(1,"tanush").age(25).phoneNumber("923424323").build();

    }

}
