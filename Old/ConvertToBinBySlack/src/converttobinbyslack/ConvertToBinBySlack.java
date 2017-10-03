package converttobinbyslack;

import java.util.*;

public class ConvertToBinBySlack {

    public static void main(String[] args) {
        Stack s = new Stack();

        Scanner sc = new Scanner(System.in);
//        String st = sc.nextLine();
//        for (int i = 0; i < st.length(); i++) {
//            if (st.charAt(i) == '(') {
//                s.push('(');
//            }
//            if (st.charAt(i) == ')') {
//                if(s.isEmpty()) {
//                    s.push(')');
//                    break;}
//                s.pop();
//            }
//        }
//        if (s.isEmpty()) {
//            System.out.println("ngon");
//        } else {
//            System.out.println("tach");
//        }
//        
        Integer n = new Integer(sc.nextLine());
        while(n>0){
            s.push(n%2);
            n=n/2;
        }
        while(!s.isEmpty()){
        System.out.print(s.pop());}

    }

}
