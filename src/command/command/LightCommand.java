package command.command;

import command.receiver.Light;

public class LightCommand implements Command {
    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute(boolean state) {
        if (light.isState() == state)
            return;
        else if(state){
            light.on();
        }
        else {
            light.off();
        }
    }
}
