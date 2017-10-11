import java.util.Stack;

public class PreOrderTravIter implements Iter<Component> {

    Iter preOrderIterator = null;
    Stack<Iter<Component>> iteratorStack = null;

    public PreOrderTravIter(Iter preOrderIterator){
        this.preOrderIterator = preOrderIterator;
        this.iteratorStack = new Stack<>();
        this.iteratorStack.push(this.preOrderIterator);
    }

    @Override
    public void reset() {
        this.iteratorStack.clear();
        this.preOrderIterator.reset();
        this.iteratorStack.push(preOrderIterator);
    }

    @Override
    public void next() {
        //still haven't figured it out
    }

    @Override
    public boolean isDone() {
        if(this.iteratorStack.empty() == true){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Component currentItem() {
        return this.iteratorStack.peek().currentItem();
    }
}
