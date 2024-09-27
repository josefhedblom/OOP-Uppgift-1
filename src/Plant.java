public abstract class Plant {
    private String type;
    private int height;
    private double fluidRequirement;

    public Plant(String type, int height, double fluidRequirement) {
        this.type = type;
        this.height = height;
        this.fluidRequirement = fluidRequirement;
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    public double getFluidRequirement() {
        return fluidRequirement;
    }
}
