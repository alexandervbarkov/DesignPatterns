package state;

public class Application {
    public static void main(String... args) {
        GumBallMachine gumBallMachine = new GumBallMachine(2);
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.turnCrank();
        gumBallMachine.ejectQuarter();
        gumBallMachine.insertQuarter();
        gumBallMachine.ejectQuarter();
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.insertQuarter();
        gumBallMachine.ejectQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.refill(1);
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
    }
}
