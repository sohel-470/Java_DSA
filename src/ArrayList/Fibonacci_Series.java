package ArrayList;

import java.util.ArrayList;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int n = 8;
        ArrayList arr = new ArrayList(n);
        arr.add(0); arr.add(1);
        int a=0, b=1, c=0, i=1;
        if(n==0) System.out.println("[]");
        else if(n==1) System.out.println("["+arr.get(0)+"]");
        else {
            while(i<=n-2){
                c=a+b;
                a=b;
                b=c;
                arr.add(b);
                i++;
            }
            System.out.println(arr);
        }
    }
}
