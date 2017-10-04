public abstract class Composite extends Component {

    private Composite parent;

    abstract public void add(Component sc);

    abstract public void remove(Component sc);

    public Composite getParent() {
        return parent;
    }

    public void setParent(Composite parent) {
        this.parent = parent;
    }
}
