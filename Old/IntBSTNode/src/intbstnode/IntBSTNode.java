package intbstnode;

import java.util.ArrayList;

public class IntBSTNode {
    public static void main(String[] args) {
        IntBST t = new IntBST();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(3);
        a.add(4);
        a.add(9);
        a.add(2);
        for (int i = 0; i < a.size(); i++) {
           
                   t.Insert(a.get(i));
 
        }
        t.preOrder(t.root);
        
    }
    
}
