package command.pattern;

/**
 -------13/08/15.
 */
public class ConcreteReceiver extends Receiver {

    @Override
    public void doAction() {
        System.out.println("Action on CONCRETE receiver");
    }

}
