import java.util.LinkedList;
import java.util.List;

public class LinkedComposite extends Component {

    //private List<Component> myList;
    private linkedList myList;

    public LinkedComposite(){
        this.myList = new linkedList();
    }

    public LinkedComposite(Component... components){
        this.myList = new linkedList();
        for(Component i : components){
            this.myList.add(i);
        }
    }

    @Override
    public void doAdd(Component sc) {
        if(sc.getParent() != null){
            System.out.println("ERROR: ALREADY HAS PARENT");
            return;
        }
        if(this.myList == null){
            this.myList.add(sc);
            sc.setParent(this);
        }
        if(!this.myList.contains(sc)){
            this.myList.add(sc);
            sc.setParent(this);
        }
        else{
            System.out.println("ERROR: ADDITION FOR LC FAILED");
        }
    }

    @Override
    public void doRemove(Component sc) {
        if(this.myList != null){
            if(this.myList.contains(sc)){
                this.myList.remove(sc);
                sc.setParent(null);
            }
            else{
                System.out.println("ERROR: REMOVAL FOR LC FAILED DUE TO NOT CONTAINING COMPONENT");
            }
        }
        else{
            System.out.println("ERROR: REMOVAL FOR LC FAILED BECAUSE NULL LISt");
        }
    }

    public linkedList getMyList(){
        return this.myList;
    }
}
