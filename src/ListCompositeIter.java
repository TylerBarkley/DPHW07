public class ListCompositeIter implements Iter<Component> {

    Node head = null;
    Node current = null;

    ListCompositeIter(Node head){
        this.head = head;
        this.current = head;
    }

    @Override
    public void reset() {
        current = head;
    }

    @Override
    public void next() {
        if(current != null){
            current = current.getNext();
        }
    }

    @Override
    public boolean isDone() {
        if(current.getNext() == null){
            return true;
        }
        return false;
    }

    @Override
    public Component currentItem() {
        return (Component) current.getInformation();
    }
}
