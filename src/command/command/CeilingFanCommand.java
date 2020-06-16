package command.command;

import command.receiver.CeilingFan;

import java.util.stream.IntStream;

public class CeilingFanCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute(boolean state) {
        if(state) {
            ceilingFan.pullString();
        } else {
            IntStream.range(0, CeilingFan.NUMBER_OF_SPEEDS)
                    .forEach(i -> ceilingFan.pullString());
        }
    }
}
