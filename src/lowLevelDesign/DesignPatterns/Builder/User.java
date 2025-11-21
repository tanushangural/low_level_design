package lowLevelDesign.DesignPatterns.Builder;

public class User {
    private final int id;
    private final String name;
    private final String phoneNumber; //optional
    private final int age; // optional

    public User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.phoneNumber = builder.phoneNumber;
    }



    public static class Builder {
        private int id;
        private String name;
        private String phoneNumber;
        private int age;

        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
            this.age = 0;
            this.phoneNumber = "";
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public User build() {
            return new User(this);
        }



    }
}

// Scenarios when to use Builder pattern
//1. Optional agrs
//2. to maintain immutiablity
//3. using chaning for make more intuative and less line of code needs to write
