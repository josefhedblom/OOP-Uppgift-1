import javax.swing.*;

public class Cactus extends Plant {

    public Cactus(String type,String name,double height) {
        super(type, name, height);
    }

    public double calculateFluidRequirement(){
        return 0.2;
    }

    @Override
    public FluidType getFluidType() {
        return FluidType.MINERAL_WATER;
    }

    public String getFluidRequirement() {
        return this.getType() + " " + this.getName() + " behöver " +
                this.calculateFluidRequirement() + " liter " + getFluidType().getDescription();
    }
}
