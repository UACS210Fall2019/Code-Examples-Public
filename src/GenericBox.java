//GenericBox AFTER type erasure occurs
public class GenericBox {

    private Object item;

    public GenericBox(Object item) {
        this.item = item;
    }

    public Object get() {
        return item;
    }

    public void put(Object item) {
        this.item = item;
    }

}
