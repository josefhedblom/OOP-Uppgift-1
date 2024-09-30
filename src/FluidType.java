public enum FluidType {
    TAP_WATER("Kranvatten"),
    PROTEIN_DRINK("proteindryck"),
    MINERAL_WATER("mineralvatten");

    private String description;

    FluidType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
