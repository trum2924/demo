package Tree;
public class BSTNode {

    protected int infor;
    protected BSTNode left, right;

    public BSTNode() {
        left = right = null;

    }

    public BSTNode(int el) {
        this(el, null, null);
    }
    public  BSTNode (int el, BSTNode lt, BSTNode rt){
        infor=el;
        left=lt;
        right=rt;
    }

}
