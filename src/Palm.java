
public class Palm extends Plant {
    public Palm(String type,String name,double height) {
        super(type, name, height);
    }

    @Override
    public double calculateFluidRequirement() {
        return 0.5 * this.getHeight();
    }

    @Override
    public FluidType getFluidType() {
        return FluidType.TAP_WATER;
    }

    public String getFluidRequirement() {
        return this.getType() + " " + this.getName() + " behöver " +
                this.calculateFluidRequirement() + " liter " + getFluidType().getDescription();
    }
}
