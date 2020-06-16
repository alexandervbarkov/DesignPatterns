package state.state;

import state.GumBallMachine;

public class PaidState implements State {
    private GumBallMachine gumBallMachine;

    public PaidState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter is already inserted");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter ejected");
        gumBallMachine.setCurrentState(gumBallMachine.getUnpaidState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Crank turned");
        gumBallMachine.dispense();
        State state = gumBallMachine.getGumballsCount() > 0 ? gumBallMachine.getUnpaidState() : gumBallMachine.getSoldOutState();
        gumBallMachine.setCurrentState(state);
    }
}
