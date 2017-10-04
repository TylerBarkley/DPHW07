import java.util.LinkedList;
import java.util.List;

public class LinkedComposite extends Composite {

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
    public void add(Component sc) {
        if(sc.getParent() != null){
            System.out.println("ERROR: ALREADY HAS PARENT");
            return;
        }
        if(this.myList == null){
            this.myList.add(sc);
        }
        if(!this.myList.contains(sc)){
            this.myList.add(sc);
        }
        else{
            System.out.println("ERROR: ADDITION FOR LC FAILED");
        }
    }

    @Override
    public void remove(Component sc) {
        if(this.myList != null){
            if(this.myList.contains(sc)){
                this.myList.remove(sc);
            }
            else{
                System.out.println("ERROR: REMOVAL FOR LC FAILED DUE TO NOT CONTAINING COMPONENT");
            }
        }
        else{
            System.out.println("ERROR: REMOVAL FOR LC FAILED BECAUSE NULL LISt");
        }
    }

    public String toString(){
        StringBuilder finalString = new StringBuilder();
        finalString.append("LinkedComposite containing\n");
        for(int i = 0; i < myList.getSize(); i++){
            Component c = (Component) myList.get(i);
            finalString.append(c.toString(1));
        }
        return finalString.toString();
    }

    @Override
    public String toString(int depth) {
        StringBuilder finalString = new StringBuilder();
        for(int i = 0; i < depth; i++){
            finalString.append("\t");
        }
        depth++;
        finalString.append("LinkedComposite containing\n");
        for(int i = 0; i < myList.getSize(); i++){
            Component c = (Component) myList.get(i);
            finalString.append(c.toString(depth));
        }
        return finalString.toString();
    }

/*    public void setMyList(LinkedList<Component> myList) {
        this.myList = myList;
    }*/

    public linkedList getMyList(){
        return this.myList;
    }
}
