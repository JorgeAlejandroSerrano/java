package facade.pattern;

/**
------- 12/08/15.
 */
public class ConcreteActionOne implements Action {
    @Override
    public void doSomething() {
        System.out.println("\tDoing something in action One");
    }
}
