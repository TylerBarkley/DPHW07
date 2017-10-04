public class Leaf extends Component {

    private String name;

    Leaf(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Leaf " + name + "\n";
    }

    public String toString(int depth){
        StringBuilder finalString = new StringBuilder();
        for(int i = 0; i < depth; i++){
            finalString.append("\t");
        }
        finalString.append("Leaf " + name + "\n");
        return finalString.toString();
    }
}
