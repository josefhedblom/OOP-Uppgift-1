public class Palm extends Plant implements FluidRequirement {
    public Palm(String type,String name,double height) {
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
