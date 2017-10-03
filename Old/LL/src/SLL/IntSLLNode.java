package SLL;

public class IntSLLNode {

    public int info;
    public IntSLLNode next;

    public IntSLLNode() {
    }

    public IntSLLNode(int i) {
        info = i;
        next = null;
    }

    public IntSLLNode(int i, IntSLLNode n) {
        info = i;
        next = n;
    }
}

class IntSLL {

    IntSLLNode head, tail;
    int size;

    public IntSLL() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public void AddFirst(int el) {
        IntSLLNode newest = new IntSLLNode();//a
        newest.info = el;//b
        newest.next = head;//c
        head = newest;//d
        size++;
        if (tail == null) {
            tail = head;
        }
    }

//    public void traverse() throws Exception // print all info of the list
//    {
//        if (isEmpty()) {
//            throw new Exception("Empty list");
//        }
//        IntSLLNode temp = head;
//        while (temp != null) {
//            System.out.println(temp.info);
//            temp = temp.next;
//        }
//    }
    public void AddLast(int el) {
        IntSLLNode newest = new IntSLLNode();//a
        newest.info= el;
        if(!isEmpty()){
    tail.next= newest;
    tail = newest;
        } else {
            head=tail=newest;
        }
        

    }

    public int get(int position) {
        IntSLLNode p = head;
        int pos = 0;
        while ((position != pos) && (p != null)) {
            p = p.next;
            pos++;
        }
        if (p != null) {
            return p.info;
        }
        return 0;
    }

    public void Add(int el, int position) {

    }

//    public int RemoveFirst() {
//
//    }
//
//    public int RemoveLast() {
//
//    }
//
//    public int RemoveAt(int position) {
//
//    }
    public void reverse() // require take in place
    {

    }

    public void sort() {

    }
    public  void printAll(){
        IntSLLNode p = head;
        while(p!=null){
            System.out.println(p.info);
            p=p.next;
        }
    }
}


class Test {

    public static void main(String[] args) {
        IntSLL sll = new IntSLL();
//        for (int i = 0; i < 10; i++) {
//            sll.AddFirst(i);
//        }
//        try {
//            // sll.traverse();
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        sll.AddLast(1);
        sll.AddLast(3);
        sll.AddLast(9);
        sll.AddLast(7);
        sll.printAll();
        System.out.println(sll.get(2));
    }

}
