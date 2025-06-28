package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2D {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40); b.add(50);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(60);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a); l.add(b); l.add(c); l.add(d);
        //printing b
        System.out.println(l.get(1));
        //printing b[1]
        System.out.println(l.get(1).get(1));
        //printing l (linearly)
        System.out.println(l);
        System.out.println();
        //printing l grid-wise
        for(int i=0; i<l.size(); i++){
            System.out.println(l.get(i));
        }
        System.out.println();
        //printing l grid-wise using for-loop
        for(int i=0; i<l.size(); i++){
            for(int j=0; j<l.get(i).size(); j++){
                System.out.print(l.get(i).get(j)+" ");
            }
            System.out.println();
        }
        l.get(1).add(1000);

        l.get(4).add(9999);
        System.out.println(l);
    }
}
