package src.Lab._04_SayHello_03;

public class European implements Person{
    public European(String name) {
        this.name = name;
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
