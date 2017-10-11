public abstract class Component {

    private Component parent = null;

    final public Component add( Component part ){
        try{
            doAdd(part);
            part.parent = this;
        } catch(RuntimeException e){
            throw e;
        }
        return this;
    }

    final public Component remove( Component part ){
        try{
            doRemove( part );
            part.parent = null;
        } catch(RuntimeException e){
            throw e;
        }
        return this;
    }

    protected Component getParent() {
        return parent;
    }

    //Methods that Composites need to override

    public Component getChild(int number){
        return null;
    }

    protected void doAdd(Component part){
        throw new RuntimeException("add() not supported");
    }

    protected void doRemove(Component part){
        throw new RuntimeException("remove() not supported");
    }

    //done

    public String toString(){
     return (parent == null) ?
             this.hashCode() + " is the root." :
             this.hashCode() + " is the child of " + parent;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }
}
