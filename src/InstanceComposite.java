public class InstanceComposite extends Composite {

    private Component child;

    InstanceComposite(){
        this.child = null;
    }

    InstanceComposite(Component Child){
        this.child = Child;
        Child.setParent(this);
    }

    @Override
    public void add(Component sc) {
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
    public void remove(Component sc) {
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

    public String toString(){
        return "InstanceComposite containing\n\t" + this.child.toString(1);
    }

    public String toString(int depth){
        StringBuilder finalString = new StringBuilder();
         for(int i = 0; i < depth; i++){
             finalString.append("\t");
         }
         depth++;
         finalString.append("InstanceComposite containing\n" + this.child.toString(depth));
        return finalString.toString();
    }
}
