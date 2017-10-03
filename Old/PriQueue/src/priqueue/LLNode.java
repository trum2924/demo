
package priqueue;
 public class LLNode {
    
    public int info;
    public LLNode next;

    public LLNode() {
        
    }

    public LLNode(int i) {
        info = i;
        next = null;
    }

    public LLNode(int i, LLNode n) {
        info = i;
        next = n;
    }

    @Override
    public String toString() {
        return String.format("%d", info);
    }
       
}   

