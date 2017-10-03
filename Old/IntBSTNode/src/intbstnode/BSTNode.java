package intbstnode;
class BSTNode {
    protected int infor;
    protected BSTNode left,right;

    public BSTNode() {
        left=right=null;
    }
    public BSTNode(int infor) {
       this(infor,null,null);
    }

    public BSTNode(int infor, BSTNode left, BSTNode right) {
        this.infor = infor;
        this.left = left;
        this.right = right;
    }
    
}
