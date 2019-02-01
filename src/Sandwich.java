
public class Sandwich {
    private enum SANDWICH_TYPE {
        HAM, TURKEY, VEGGIE
    }

    public Sandwich() {
        type = DEFAULT_TYPE;
    }

    public Sandwich(SANDWICH_TYPE type) {
        this.type = type;
    }

    private static final SANDWICH_TYPE DEFAULT_TYPE = SANDWICH_TYPE.HAM;
    private SANDWICH_TYPE type;
}


