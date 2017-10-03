package Tree;
public class Tree {
        
    public static void main(String[] args) {
        IntBST t=new IntBST();
        int[] a={5,3,4,9,2};
        for (int i=0;i<a.length;i++){
            t.insert(a[i]);
        }
     t.preorder(t.root);
        System.out.println("");
//        System.out.println(t.countLeaf(t.root));
//        System.out.println(t.count1Child(t.root));
//        System.out.println(t.count2Child(t.root));
//        System.out.println(t.height(t.root));
        t.printByLevel(t.root,1);
    }
}
/*bai tap ve nha
-countleaf
-count1childnode
-count2childnode
-height
-prrintbylevel
-bft
*/
