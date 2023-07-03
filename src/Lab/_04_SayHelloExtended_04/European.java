package src.Lab._04_SayHelloExtended_04;

public class European extends BasePerson implements Person {
    public European(String name) {
        super(name);
    }

    private String name;
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
