package decorator.salable;

public abstract class Beverage implements Salable {
    private final String description;
    private final double cost;
    private Salable addOn;

    Beverage(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return description + (addOn == null ? "" : " " + addOn.getDescription());
    }

    @Override
    public double getCost() {
        return cost + (addOn == null ? 0 : addOn.getCost());
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
