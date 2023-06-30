package src.Exercise._03_Animals_06;

public class Kitten extends Cat {

    final static String GENDER = "Female";
    public Kitten(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}
