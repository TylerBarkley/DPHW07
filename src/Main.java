public class Main {

    public static void main(String[] args) {
        Leaf L = new Leaf("L");
        InstanceComposite IC = new InstanceComposite(L);
        System.out.println(IC.toString());
        Leaf O = new Leaf("O");
        InstanceComposite IC2 = new InstanceComposite(IC);
        System.out.println(IC2);
        Leaf M = new Leaf("M");
        IC.remove(M);
        IC.remove(L);
        IC.add(M);
        System.out.println(IC.toString());
        Leaf K = new Leaf("K");
        ArrayComposite ac = new ArrayComposite(IC, K, L);
        Leaf V = new Leaf("V");
        ac.add(V);
        ac.remove(K);
        System.out.println(ac.toString());
        ac.add(V);
        LinkedComposite lc = new LinkedComposite(ac, O, V);
        lc.remove(O);
        System.out.println(ac.toString());
        System.out.println(lc.toString());
        LinkedComposite lc2 = new LinkedComposite(O);
        System.out.println(lc2.toString());
        lc2.remove(O);
        System.out.println(lc2.toString());
    }
}
