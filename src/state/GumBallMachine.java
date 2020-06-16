package state;

import state.state.PaidState;
import state.state.SoldOutState;
import state.state.State;
import state.state.UnpaidState;

import java.util.Random;

public class GumBallMachine {
    private static State paidState;
    private static State unpaidState;
    private static State soldOutState;
    private int gumballsCount;
    private State currentState;

    public GumBallMachine(int gumballsCount) {
        paidState = new PaidState(this);
        unpaidState = new UnpaidState(this);
        soldOutState = new SoldOutState();
        if (gumballsCount < 0) {
            throw new IllegalStateException("Cannot have negative gumballs");
        }
        this.gumballsCount = gumballsCount;
        currentState = gumballsCount == 0 ? soldOutState : unpaidState;
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
    }

    public void dispense() {
        System.out.println("Gumball dispensed");
        if (--gumballsCount > 0 && new Random().nextInt(10) == 0) {
            System.out.println("Additional free gumball dispensed");
            --gumballsCount;
        }
    }

    public void refill(int gumballsCount) {
        if (gumballsCount > 0) {
            this.gumballsCount += gumballsCount;
            currentState = unpaidState;
        }
    }

    public State getPaidState() {
        return paidState;
    }

    public State getUnpaidState() {
        return unpaidState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public int getGumballsCount() {
        return gumballsCount;
    }
}
