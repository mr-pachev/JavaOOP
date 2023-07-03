package src.Lab._04_BorderControl_05;

public class Robot implements Identifiable{
    private String model;

    private String id;


    public Robot(String model, String id) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public String getModel() {
        return this.model;
    }

}
