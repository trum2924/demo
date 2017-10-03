package queue;

import java.util.*;

public class Queue {

    static LinkedList l = new LinkedList();

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        P p = new P(2);
        q.enPQueue(p);
        System.out.println(q.deQueue());

    }

    void enQueue(Object t) {
        l.addLast(t);
    }

    Object deQueue() {
        Object t = l.getFirst();
        l.removeFirst();
        return t;
    }

    void enPQueue(P t) {
       
       
    }

}
