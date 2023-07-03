package src.Lab._04_SayHelloExtended_04;

public class Bulgarian extends BasePerson implements Person {
    private String name;

    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
