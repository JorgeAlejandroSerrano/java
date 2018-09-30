package proxy.pattern;

/**
-------20/09/15.
 */
public class RealSubject implements Subject{
    @Override
    public void doService() {
        System.out.println("Real Subject doing service...");
    }
}
