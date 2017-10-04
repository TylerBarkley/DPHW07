import javax.sound.midi.SysexMessage;

public class linkedList {

    private Node head;
    private Node tail;
    public int size;

    public linkedList(){
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    public int getSize(){
        return size;
    }

    public void add(Component c){
        Node<Component> newNode = new Node<>(c);
        if(this.isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public void remove(Component c){
        Node<Component> newNode = new Node<>(c);
        if(this.isEmpty()){
            System.out.println("ERROR: REMOVE FROM LL FAILED: EMPTY LL");
            return;
        }
        if(size == 1){
            head = null;
            tail = null;
            size--;
            return;
        }
        Node tmp2 = head;
        Node tmp = head;
        while(tmp != tail){
            tmp = tmp.getNext();
            if(tmp.getInformation() == newNode.getInformation()){
                tmp2.setNext(tmp.getNext());
                tmp.setNext(null);
                size--;
                return;
            }
            tmp2 = tmp2.getNext();
        }
        System.out.println("ERROR: REMOVE FROM LL FAILED: DOES NOT CONTAIN NODE");
    }

    public boolean contains(Component c){
        Node<Component> newNode = new Node<>(c);
        if(head == null){
            return false;
        }
        if(head == tail){
            if(newNode.getInformation() == this.head.getInformation()){
                return true;
            }
            else{
                return false;
            }
        }
        Node tmp = head;
        while(tmp != tail){
            tmp = tmp.getNext();
            if(tmp.getInformation() == newNode.getInformation()){
                return true;
            }
        }
        return false;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Object get(int index){
        if(index > size + 1){
            System.out.println("ERROR:OUT OF BOUNDS");
            return null;
        }
        if(index == 0){
            return head.getInformation();
        }
        if(index == size - 1){
            return tail.getInformation();
        }
        Node tmp = head;
        int i = 0;
        while(tmp != tail){
            tmp = tmp.getNext();
            i++;
            if(i == index){
                return tmp.getInformation();
            }
        }
        System.out.println("ERROR: NULL LIST");
        return null;
    }
}
