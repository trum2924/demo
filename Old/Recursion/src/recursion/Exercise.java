package recursion;

import java.util.ArrayList;

public class Exercise {

    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(4);
        s.add(3);
        s.add(2);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        s.add(1);
        s.add(9);
        s.add(8);
        s.add(7);
        s.add(2);
        s.add(4);
        s.add(6);

//        System.out.println(stringIcre(s););
        System.out.println(stringIcre1(s, 1, 1, 0, 0, 0));
    }

    static String stringIcre(ArrayList<Integer> s) {
        int sizeg = 1, size = 1, goc = 0, goctemp = 0;
        for (int i = 0; i < s.size() - 1; i++) {
            if (s.get(i) > s.get(i + 1)) {
                goctemp = i + 1;
                size = 1;
            } else {
                size++;
            }
            if (size > sizeg) {
                sizeg = size;
                goc = goctemp;
            }
//            System.out.println(goc);
//            System.out.println(sizeg);
        }
        String result = "";
        for (int i = goc; i < goc + sizeg; i++) {
            result += s.get(i).toString();
        }
        return result;
    }

    static String stringIcre1(ArrayList<Integer> s, int sizeg, int size, int goc, int goctemp, int index) {
//        int sizeg = 1, size = 1, goc = 0, goctemp = 0;
//        for (int i = 0; i < s.size() - 1; i++) {
        String result = "";
        if (index >= s.size() - 1) {
            for (int i = goc; i < goc + sizeg; i++) {
                result += s.get(i).toString();
            }
            return result;
        }
        if (s.get(index) > s.get(index + 1)) {
            goctemp = index + 1;
            size = 1;
        } else {
            size++;
        }
        if (size > sizeg) {
            sizeg = size;
            goc = goctemp;
//                stringIcre(s,,,,,,);
        }
        for (int i = goc; i < goc + sizeg; i++) {
            result += s.get(i).toString();
        }
        return stringIcre1(s, sizeg, size, goc, goctemp, index + 1);
    }
//        int c=0;
//        for (int i = n ; i < s.size(); i++) {
//            if(c<m)
//                System.out.println(s.get(i));
//        }
}
//}
