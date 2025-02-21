package Arrays_2D;

public class Matrix_Addition {
    public static void main(String[] args) {
        int[][] arr = {{1,9,2},{3,7,4},{8,5,6}};
        int[][] brr = {{9,3,7},{8,6,5},{2,4,1}};
        int m = arr.length, n = arr[0].length;
        int[][] result = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                result[i][j] = arr[i][j]+brr[i][j];
            }
        }
        for(int[] ele : result){
            for(int x : ele){
                System.out.print(x+"  ");
            }
            System.out.println();
        }
    }
}
