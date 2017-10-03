package recursion;

import java.util.*;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(FibonacciNoRecursion(8));
    }

    static int Factorial(int n) {
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s = s * i;
        }
        return s;
    }

    static int FactorialByRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n * FactorialByRecursion(n - 1);
    }

    static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    static int GCD(int a, int b) {
        if (a > b) {
            return GCD(a - b, b);
        }
        if (a < b) {
            return GCD(a, b - 1);
        }
        return a;
    }

    static int FactorialNoRecursion(int n) {
        Stack<Integer> s = new Stack();
        int rs = 1;
        for (int i = 1; i <= n; i++) {
            s.push(i);
        }
        do {
            rs *= s.pop();
        } while (!s.isEmpty());
        return rs;
    }
    static int FibonacciNoRecursion(int n){
        Stack<Integer> s = new Stack<>();
        int a = 1,b = 1;
        s.push(a);
        s.push(b);
        while (s.size()<=n) {            
          a= s.pop();
          b= s.pop();
          s.push(b);
          s.push(a);
          s.push(a+b);
        }
        return s.pop();
    }
}
