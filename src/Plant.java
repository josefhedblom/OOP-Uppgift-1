public abstract class Plant {
    private String type;
    private String name;
    private double height;

    public Plant(String type, String name, double height) {
        this.type = type;
        this.name = name;
        this.height = height;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public double getHeight() {
        return this.height;
    }


    @Override
    public String toString() {
        return "Plant{" +
                "typ='" + this.type + '\'' +
                ", namn='" + this.name +
                ", höjd=" + this.height +
                '}';
    }
}
