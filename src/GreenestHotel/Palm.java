package GreenestHotel;

public class Palm extends Plant {

    private final double palmTapwater = 0.5;
    public Palm(String type,String name,double height) {
        super(type, name, height);
    }

    @Override
    public double calculateFluidRequirement() {
        return palmTapwater * this.getHeight();
    }

    @Override
    public FluidType getFluidType() {
        return FluidType.TAP_WATER;
    }

    public String getFluidRequirement() {
        return this.getName() + " är en " + this.getType().toLowerCase() + " och behöver " +
                this.calculateFluidRequirement() + " liter " + getFluidType().getDescription() + "  per dag";
    }
}
