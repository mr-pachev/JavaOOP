package src.Exercise._03_Animals_06;

public class Tomcat extends Cat {
    final static String GENDER = "Male";
    public Tomcat(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return "MEOW";
    }
}
