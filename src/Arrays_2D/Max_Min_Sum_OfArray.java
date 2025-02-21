package Arrays_2D;

public class Max_Min_Sum_OfArray {
    public static void main(String[] args) {
        int[][] arr = {{99,2,3},{4,5,6},{7,10,9},{6,2,9}};
        int m = arr.length, n = arr[0].length;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
        //TC -   O(n^2)
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                max = Math.max(arr[i][j],max);
                min = Math.min(arr[i][j],min);
                sum = arr[i][j] + sum;
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Sum: "+sum);
    }
}
