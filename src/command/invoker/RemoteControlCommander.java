package command.invoker;

import command.command.Command;
import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RemoteControlCommander {
    private Map<Integer, Command> positionCommandMap;
    private Stack<Pair<Command, Boolean>> commandStack;

    public RemoteControlCommander() {
        positionCommandMap = new HashMap<>();
        commandStack = new Stack<>();
    }

    public void add(int position, Command command) {
        positionCommandMap.put(position, command);
    }

    public void remove(int position) {
        positionCommandMap.remove(position);
    }

    public void execute(int position, boolean state) {
        Command command = positionCommandMap.get(position);
        if (command == null) {
            return;
        }
        command.execute(state);
        commandStack.add(new Pair<>(command, state));
    }

    public void undo() {
        if(commandStack.empty())
            return;
        Pair<Command, Boolean> commandStatePair = commandStack.pop();
        Command command = commandStatePair.getKey();
        command.execute(!commandStatePair.getValue());
    }
}
