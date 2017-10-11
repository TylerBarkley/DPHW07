public class OtherIter implements Iter<Component> {

    Component component = null;

    public OtherIter(Component component){
        this.component = component;
    }

    @Override
    public void reset() {
        return;
    }

    @Override
    public void next() {
        return;
    }

    @Override
    public boolean isDone() {
        return true;
    }

    @Override
    public Component currentItem() {
        return component;
    }
}
