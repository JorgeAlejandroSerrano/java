package prototype.pattern;

/**
-------23/07/15.
 */
public class PrototypeFactory {

    public Prototype getClone(Prototype proto){
        return proto.clone();
    }

}
