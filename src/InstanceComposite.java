public class InstanceComposite extends Component {

    private Component child;

    InstanceComposite(){
        this.child = null;
    }

    InstanceComposite(Component Child){
        this.child = Child;
        Child.setParent(this);
    }

    @Override
    public void doAdd(Component sc) {
        if(sc.getParent() != null){
            System.out.println("ERROR: ALREADY HAS PARENT");
            return;
        }
        if(this.child == null){
            this.child = sc;
            this.child.setParent(this);
        }
        else{
            System.out.println("ERROR: INSTANCECOMPOSITE HAS COMPONENT");
        }
    }

    @Override
    public void doRemove(Component sc) {
        if(sc == this.child){
            this.child = null;
            sc.setParent(null);
        }
        else{
            System.out.println("ERROR: COMPONENT IS NOT THE SAME AS REMOVAL");
        }
    }

    public Component getChild() {
        return child;
    }

    public void setChild(Component child) {
        this.child = child;
    }

}
