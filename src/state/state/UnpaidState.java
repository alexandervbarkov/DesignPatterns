package state.state;

import state.GumBallMachine;

public class UnpaidState implements State {
    private GumBallMachine gumBallMachine;

    public UnpaidState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter inserted");
        gumBallMachine.setCurrentState(gumBallMachine.getPaidState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarter to eject");
    }

    @Override
    public void turnCrank() {
        System.out.println("Insert quarter first");
    }
}
