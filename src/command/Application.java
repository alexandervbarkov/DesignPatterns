package command;

import command.command.LightCommand;
import command.command.CeilingFanCommand;
import command.invoker.RemoteControlCommander;
import command.receiver.CeilingFan;
import command.receiver.Light;

public class Application {
    public static void main(String... args) {
        RemoteControlCommander remoteControlCommander = new RemoteControlCommander();
        remoteControlCommander.execute(1, true);
        remoteControlCommander.undo();
        remoteControlCommander.add(1, new CeilingFanCommand(new CeilingFan("Living room ceiling fan")));
        remoteControlCommander.execute(1, true);
        remoteControlCommander.execute(1, true);
        remoteControlCommander.execute(1, true);
        System.out.println("Decreasing speed");
        remoteControlCommander.execute(1, false);
        System.out.println("Undoing");
        remoteControlCommander.undo();
        System.out.println("Undoing again");
        remoteControlCommander.undo();
        remoteControlCommander.remove(1);
        System.out.println("Undoing third time");
        remoteControlCommander.undo();
        remoteControlCommander.remove(1);
        remoteControlCommander.add(2, new CeilingFanCommand(new CeilingFan("Kitchen ceiling fan")));
        remoteControlCommander.add(2, new LightCommand(new Light("Living room light")));
        remoteControlCommander.execute(1, false);
        remoteControlCommander.execute(2, false);
        remoteControlCommander.execute(2, true);
        remoteControlCommander.execute(2, false);
        remoteControlCommander.undo();
    }
}
