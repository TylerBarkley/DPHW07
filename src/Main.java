public class Main {

    public static void main(String[] args) {
        Leaf L = new Leaf("L");
        InstanceComposite IC = new InstanceComposite(L);
        System.out.println(IC.toString());
        Leaf O = new Leaf("O");
        InstanceComposite IC2 = new InstanceComposite(IC);
        OtherIter OI = new OtherIter(IC2);
        OtherIter OI2 = new OtherIter(O);
        if(OI.isDone() == true && OI2.isDone() == true){
            System.out.println("OtherIter test passed");
        }
        else {
            System.out.println("Tests didn't pass");
        }
        System.out.println(IC2);
        Leaf M = new Leaf("M");
        IC.doRemove(M);
        IC.doRemove(L);
        IC.doAdd(M);
        System.out.println(IC.toString());
        Leaf K = new Leaf("K");
        ArrayComposite ac = new ArrayComposite(IC, K, L);
        ArrayCompositeIter ai = new ArrayCompositeIter(ac.getArray());
        ai.next();
        if(ai.currentItem() == K || ai.currentIndex == 1){
            System.out.println("The Array Composite Iterator works");
        }
        Leaf V = new Leaf("V");
        ac.doAdd(V);
        ac.doRemove(K);
        System.out.println("AC");
        System.out.println(ac.toString());
        ac.doAdd(V);
        LinkedComposite lc = new LinkedComposite(ac, O, V);
        lc.doRemove(O);
        System.out.println(ac.toString());
        System.out.println(lc.toString());
        LinkedComposite lc2 = new LinkedComposite(O);
        ListCompositeIter li = new ListCompositeIter(lc2.getMyList().getHead());
        if(li.current.getNext() == null){
            System.out.println("The List Composite Iterator works");
        }
        System.out.println(lc2.toString());
        lc2.doRemove(O);
        System.out.println(lc2.toString());
    }
}
