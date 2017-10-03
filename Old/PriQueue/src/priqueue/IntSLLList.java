/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priqueue;

import java.util.NoSuchElementException;

/**
 *
 * @author oV nauT
 */
public class IntSLLList {

    LLNode head, tail;
    int size;

    public IntSLLList() {
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

    public void addFirst(int el) {
        LLNode newest = new LLNode();
        newest.info = el;
        newest.next = head;
        head = newest;
        size++;
        if (tail == null) {
            tail = head;
        }
    }

    public void traverse() {// print all info of the list
        if (isEmpty()) {
            return;
        }
        LLNode temp = head;
        while (temp != null) {
            System.out.println(temp.info);
            temp = temp.next;
        }
    }

    public void addLast(int el) {
        if (size == 0) {
            addFirst(el);
        } else {
            LLNode newest = new LLNode(el);
            tail.next = newest;
            tail = newest;
            size++;
        }
    }

    public void add(int el, int position) {
        if (position == size) {
            addLast(el);
        } else if (position == 0) {
            addFirst(el);
        } else if (position > size || position < 0) {
            throw new IndexOutOfBoundsException();
        } else if (position < size) {
            LLNode temp1 = head;
            LLNode newest = new LLNode(el);
            for (int i = 0; i < position - 1; i++) {
                temp1 = temp1.next;
            }
            LLNode temp2 = temp1.next;
            newest.next = temp2;
            temp1.next = newest;
            size++;
        }
    }

    public void removeFirst() {
        if (size == 0) {
            throw new NoSuchElementException();
        } else {
            head = head.next;
            size--;
        }
    }

    public void removeLast() {
        if (size == 0) {
            throw new NoSuchElementException();
        } else {
            LLNode temp = head;
            for (int i = 0; i < size - 2; i++) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
    }

    public void removeAt(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            if (position == 0) {
                removeFirst();
            } else {
                LLNode temp1 = head;
                for (int i = 0; i < position - 1; i++) {
                    temp1 = temp1.next;
                }
                LLNode temp2 = temp1.next.next;
                temp1.next = temp2;
                size--;
            }
        }
    }

    public LLNode nodeAt(int position) {
        LLNode temp = head;
        if (position >= size || position < 0) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void reverse() { // require take in place
        if (size == 0) {
            return;
        }
        LLNode temp = tail;
        for (int i = size - 1; i > 0; i--) {
            nodeAt(i).next = nodeAt(i - 1);
        }
        head.next = null;
        tail = nodeAt(0);
        head = temp;
    }

    public void swapNode(int pos) {
        if (pos >= size - 1 || pos < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            if (pos == 0) {
                LLNode temp1 = head;
                LLNode temp2 = head.next;
                temp1.next = temp2.next;
                temp2.next = temp1;
                head = temp2;
            } else {
                LLNode temp1 = nodeAt(pos);
                LLNode temp2 = nodeAt(pos + 1);
                temp1.next = temp2.next;
                nodeAt(pos - 1).next = temp2;
                temp2.next = temp1;
            }
        }
    }

    public void sort() {
        if (size == 0) {
            return;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (nodeAt(j).info > nodeAt(j + 1).info) {
                    swapNode(j);
                }
            }
        }
    }
}

