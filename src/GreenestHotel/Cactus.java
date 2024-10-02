import javax.swing.*;

public class Cactus extends Plant {
    private final double cactusMineralWater = 0.02;

    public Cactus(String type,String name,double height) {
        super(type, name, height);
    }

    public double calculateFluidRequirement(){
        return cactusMineralWater;
    }

    @Override
    public FluidType getFluidType() {
        return FluidType.MINERAL_WATER;
    }

    public String getFluidRequirement() {
        return this.getName() + " är en " + this.getType().toLowerCase() + " och behöver " +
                this.calculateFluidRequirement() + " cl " + getFluidType().getDescription() + " per dag";
    }
}
