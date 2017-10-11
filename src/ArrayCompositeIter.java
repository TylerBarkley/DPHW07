public class ArrayCompositeIter implements Iter<Component> {

    int currentIndex;
    Component[] iterCompArray = null;

    public ArrayCompositeIter(Component[] iterCompArray){
        this.iterCompArray = iterCompArray;
    }

    @Override
    public void reset() {
        currentIndex = 0;
    }

    @Override
    public void next() {
        currentIndex++;
    }

    @Override
    public boolean isDone() {
        if (iterCompArray[currentIndex] == null) {
            return true;
        }
        else if(currentIndex == iterCompArray.length){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Component currentItem() {
        return iterCompArray[currentIndex];
    }
}
