package intbstnode;

public class IntBST {

    protected BSTNode root;

    public IntBST() {
        root = null;
    }

    void Insert(int el) {
        BSTNode p = root, prev = null;
        while (p != null) {
            prev = p;
            if (p.infor < el) {
                p = p.right;
            } else {
                p = p.left;
            }
        }
        if (root == null) {
            root = new BSTNode(el);
            return;
        }
        if (prev.infor < el) {
            prev.right = new BSTNode(el);
        } else {
            prev.left = new BSTNode(el);
        }
    }

    void InsertByRecur(int el, BSTNode r) {
        if (root == null) {
            root = new BSTNode(el);
            return;
        }
        if (root.infor < el) {
            InsertByRecur(el, root.left);
        } else {
            InsertByRecur(el, root.right);
        }
    }

    void preOrder(BSTNode t) {
        if(t==null)
            return;
        System.out.println(t.infor);
        preOrder(t.left);
        preOrder(t.right);
    }
}
