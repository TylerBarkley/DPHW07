public class ArrayComposite extends Composite {

    private Component[] array;

    ArrayComposite(){

    }

    ArrayComposite(Component... components){
        int LengthOfArray = components.length;
        this.array = new Component[LengthOfArray];
        int x = 0;
        for(Component i : components){
            this.array[x] = i;
            x++;
        }
    }

    @Override
    public void add(Component sc) {
        if(sc.getParent() != null){
            System.out.println("ERROR: ALREADY HAS PARENT");
            return;
        }
        int loopCount = array.length;
        boolean help = false;
        for(int i = 0; i < loopCount; i++){
            if(this.array[i] == null){
                this.array[i] = sc;
                sc.setParent(this);
                help = true;
            }
        }
        if(help == false){
            System.out.println("ERROR: ADDITION FAILED");
        }
    }

    @Override
    public void remove(Component sc) {
        boolean help = false;
        int loopCount = array.length;
        for(int i = 0; i < loopCount; i++){
            if(this.array[i] == sc){
                this.array[i] = null;
                sc.setParent(null);
                help = true;
            }
        }
        if(help == false){
            System.out.println("ERROR: REMOVAL FAILED");
        }
    }

    public Component[] getArray() {
        return array;
    }

    public void setArray(Component[] array) {
        this.array = array;
    }

    public String toString(){
        StringBuilder finalString = new StringBuilder();
        finalString.append("ArrayComposite containing\n");
        for(int i = 0; i < array.length; i++){
            if(array[i] != null) {
                finalString.append(array[i].toString(1));
            }
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
        finalString.append("ArrayComposite containing\n");
        for(int i = 0; i < array.length; i++){
            if(array[i] != null) {
                finalString.append(array[i].toString(depth));
            }
        }
        return finalString.toString();
    }
}
