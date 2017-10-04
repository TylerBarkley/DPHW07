public abstract class Component {

    private Component parent;

    public Component getParent() {
        return parent;
    }

    abstract String toString(int depth);

    public void setParent(Component parent) {
        this.parent = parent;
    }
}
