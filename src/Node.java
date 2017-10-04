public class Node<T> {

    private Node<T> next = null;
    private T information;

    Node(T parameter){
        this.information = parameter;
        this.next = null;
    }

    public T getInformation() {
        return information;
    }

    public void setInformation(T information) {
        this.information = information;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
