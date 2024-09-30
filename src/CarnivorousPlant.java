import javax.swing.*;

public class CarnivorousPlant extends Plant {
    public CarnivorousPlant(String type,String name,double height) {
        super(type, name, height);
    }


    public double calculateFluidRequirement() {
        return 0.1 + (0.2* this.getHeight());
    }

    @Override
    public FluidType getFluidType() {
        return FluidType.PROTEIN_DRINK;
    }

    public String getFluidRequirement() {
        return this.getType() + " " + this.getName() + " behöver " +
                this.calculateFluidRequirement() + " liter " + getFluidType().getDescription();
    }
}
