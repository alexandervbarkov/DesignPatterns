package command.receiver;

public class CeilingFan {
    public static final int NUMBER_OF_SPEEDS = 5;
    private int currentSpeed;
    private String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void pullString() {
        if (currentSpeed < NUMBER_OF_SPEEDS) {
            ++currentSpeed;
        } else {
            currentSpeed = 0;
        }
        System.out.println(name + " speed: " + currentSpeed);
    }
}
