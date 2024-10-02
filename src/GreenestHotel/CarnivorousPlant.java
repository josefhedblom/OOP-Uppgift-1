import javax.swing.*;

public class CarnivorousPlant extends Plant {
    private final double proteinDrink = 0.1;
    public CarnivorousPlant(String type,String name,double height) {
        super(type, name, height);
    }


    public double calculateFluidRequirement() {
        return proteinDrink + ((proteinDrink * 2) * this.getHeight());
    }

    @Override
    public FluidType getFluidType() {
        return FluidType.PROTEIN_DRINK;
    }


    public String getFluidRequirement() {
        return this.getName() + " är en " + this.getType().toLowerCase() + " och behöver " +
                this.calculateFluidRequirement() + " liter " + getFluidType().getDescription() + " per dag";
    }
}
