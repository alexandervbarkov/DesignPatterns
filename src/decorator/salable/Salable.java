package decorator.salable;

public interface Salable {
    String getDescription();
    double getCost();
    Salable addAddOn(Salable newAddOn);
    void setAddOn(Salable salable);
}
