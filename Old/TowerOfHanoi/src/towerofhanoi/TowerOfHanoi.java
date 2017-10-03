package towerofhanoi;

import java.util.*;

public class TowerOfHanoi {

    public static void main(String[] args) {
//        Stack n = new Stack();
//        int num=9;
//            for (int i = 1; i <=num ; i++) {
//        n.push(i);
//        }
//            Stack d = new Stack();
//            hanoi(num, n, d);
//            System.out.println(n);
//            System.out.println(d);
//           
        hanoiTower(3, "A", "B", "C");
    }
//    static Stack move(Stack n,Stack d,Stack t){        
//    }

    static void hanoi(int n, Stack source, Stack target) {
        Stack between = new Stack();
        if (n == 1) {
            target.push(source.pop());
        } else {
            hanoi(n - 1, source, between);
            target.push(source.pop());
            hanoi(n - 1, between, target);
        }
    }

    static void hanoiTower(int n, String source, String between, String target) {
        if (n == 1) {
            System.out.println(source + "->" + target);
        } else {
            hanoiTower(n - 1, source, target, between);
            System.out.println(source + "->" + target);
            hanoiTower(n - 1, between, source, target);
        }
    }

    static void kk(int n) {
        if (n < 1) {
            return;
        }
        kk(n - 1);
        System.out.println(n);
    }
}
