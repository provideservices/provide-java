package services.provide.dao;

public class ABIInput {
    private String name;
    private String type;

    public ABIInput() {
    }

    public ABIInput(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ABIInputs [name=" + name + ", type=" + type + "]";
    }

}
