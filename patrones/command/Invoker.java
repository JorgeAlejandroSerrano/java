package command.pattern;

/**
 -------13/08/15.
 */
public class Invoker {
    public void executeCommand(Command command, Receiver receiver){
        command.execute(receiver);
    }
}
