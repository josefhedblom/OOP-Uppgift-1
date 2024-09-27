public class Cactus extends Plant implements FluidRequirement {

    public Cactus(String type,String name,double height) {
        super(type, name, height);
    }

    @Override
    public String calulateFluidRequirement() {
        return "";
    }

    @Override
    public String getFluidRequirement() {
        return "";
    }
}
