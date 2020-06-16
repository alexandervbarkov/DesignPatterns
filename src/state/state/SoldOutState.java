package state.state;

public class SoldOutState implements State {
    @Override
    public void insertQuarter() {
        System.out.println("Sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sold out");
    }
}
