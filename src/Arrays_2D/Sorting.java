package Arrays_2D;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[][] arr = {{5, 2},{4, 3},{3, 2},{2, 1},{1, 3}}; // (val1, val2) pair
        //sorting wrt val1:-->
        Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));

        //printing the 2d array
        for(int[] ele:arr){
            System.out.println("("+ele[0]+","+ele[1]+")");
        }
        System.out.println();

        int[][] brr = {{2, 5},{3, 4},{2, 3},{8, 2},{3, 1}}; // (val1, val2) pair
        //sorting wrt val2:-->
        Arrays.sort(brr,(a,b)-> Integer.compare(a[1],b[1]));

        //printing the 2d array
        for(int[] ele:brr){
            System.out.println("("+ele[0]+","+ele[1]+")");
        }
        System.out.println();

        int[][] crr = {{4, 2},{4, 3},{4, 8},{2, 1},{1, 3}}; // (val1, val2) pair
        //sorting wrt val1, val2 is tie-breaker:-->
        Arrays.sort(crr,(a,b)-> {
            if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
            return Integer.compare(a[1],b[1]);
        });

        //printing the 2d array
        for(int[] ele:crr){
            System.out.println("("+ele[0]+","+ele[1]+")");
        }
        System.out.println();

        //We can also sort
    }

}
