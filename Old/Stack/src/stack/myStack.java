package stack;

import java.util.ArrayList;

public class myStack<T> {

    private ArrayList<T> s = new ArrayList<>();

    public myStack() {
    }

    public myStack(int n) {
        s.ensureCapacity(n);
    }

    void clear() {
        s.clear();
    }

    public boolean isEmpty() {
        return s.isEmpty();
    }

    void push(T x) {
        s.add(x);
    }

    void pop() {
        if (s.isEmpty()) {
            System.out.println("Empty");
        }
        System.out.println(s.get(s.size() - 1));
        s.remove(s.size() - 1);
    }

    void peek(int n) {
        if (s.isEmpty()) {
            System.out.println("Empty");
        }
        System.out.println(s.get(s.size() - 1));

    }

    public static void main(String[] args) {
        myStack s = new myStack();
        s.push(1);
        s.push(3);
        s.push(2);
        s.push(4);
        s.pop();
        s.pop();
        
    }

}
