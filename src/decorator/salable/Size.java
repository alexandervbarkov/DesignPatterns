package decorator.salable;

public enum Size implements Salable {
    Small("Small", .5),
    Medium("Medium", 1),
    Large("Large", 2);

    private final String description;
    private final double cost;
    private Salable addOn;

    Size(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return description + (addOn == null ? "" : " " + addOn.getDescription());
    }

    @Override
    public double getCost() {
        return cost * (addOn == null ? 0 : addOn.getCost());
    }

    @Override
    public Salable addAddOn(Salable newAddOn) {
        newAddOn.setAddOn(this);
        return newAddOn;
    }

    @Override
    public void setAddOn(Salable salable) {
        this.addOn = salable;
    }
}
