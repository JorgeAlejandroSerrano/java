package command.pattern;

/**
 -------13/08/15.
 */
public class ConcreteCommand extends Command {

    private Receiver receiver;

    @Override
    public void execute(Receiver receiver) {
        receiver.doAction();
        this.receiver = receiver;
    }

}
