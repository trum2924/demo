package Tree;

public class IntBST {

    protected BSTNode root;

    public IntBST() {
        root = null;
    }

    void insert(int x) {
        {
            if (root == null) {
                root = new BSTNode(x);
                return;
            }
            BSTNode f, p;
            p = root;
            f = null;
            while (p != null) {

                f = p;
                if (x < p.infor) {
                    p = p.left;
                } else {
                    p = p.right;
                }
            }
            if (x < f.infor) {
                f.left = new BSTNode(x);
            } else {
                f.right = new BSTNode(x);
            }

        }
    }

    void preorder(BSTNode t) {
        if (t != null) {
            System.out.print(t.infor + " ");
            preorder(t.left);
            preorder(t.right);
        }

    }

    void inorder(BSTNode t) {
        if (t != null) {
            System.out.print(t.infor + " ");
            preorder(t.right);
            preorder(t.left);
        }

    }

    int countLeaf(BSTNode t) {
        if (t == null) {
            return 0;
        }
        return (t.left == null && t.right == null) ? 1 : countLeaf(t.left) + countLeaf(t.right);
    }

    int count1Child(BSTNode t) {
        if (t == null) {
            return 0;
        }
        int a = count1Child(t.left);
        int b = count1Child(t.right);
        if ((t.left == null && t.right != null) || (t.left != null && t.right == null)) {
            return a + b + 1;
        }
        return a + b;
    }

    int count2Child(BSTNode t) {
        if (t == null) {
            return 0;
        }
        int a = count1Child(t.left);
        int b = count1Child(t.right);
        if ((t.left != null && t.right != null) || (t.left != null && t.right != null)) {
            return a + b;
        }
        return a + b;
    }
    int height(BSTNode t){
       if(t==null)return 0;
       int l=height(t.left);
       int r=height(t.right);
       if(l>r) return l+1;
       return r+1;
    }
    public void printByLevel(BSTNode p,int k){
        if(p !=null){
            k--;
            if(p.left!=null){
                printByLevel(p.left, k);
            }
            if(k==0){
                System.out.printf("%4d",p.infor);
            }
            if(p.right!=null){
                printByLevel(p.right, k);
            }
        }
    }
}
