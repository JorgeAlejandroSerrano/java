package abstractfactory.pattern;

/**
 -------16/07/15.
 */
public class ConcreteFactoryTwo extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductATwo();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductBTwo();
    }
}
