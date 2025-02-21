package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascals_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int n = sc.nextInt();
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0; i<n; i++){
            List<Integer> a = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i) a.add(1);
                else a.add(l.get(i-1).get(j-1) + l.get(i-1).get(j));
            }
            l.add(a);
        }
        System.out.println(l);
    }
}
