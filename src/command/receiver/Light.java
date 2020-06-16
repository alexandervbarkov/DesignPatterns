package command.receiver;

public class Light {
    private boolean state;
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        state = true;
        System.out.println(name + ": on");
    }

    public void off() {
        state = false;
        System.out.println(name + ": off");
    }

    public boolean isState() {
        return state;
    }
}
