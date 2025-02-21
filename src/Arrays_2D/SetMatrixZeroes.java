package Arrays_2D;

public class SetMatrixZeroes {
    static void print(int[][] axx){
        for(int[] ele : axx){
            for(int x : ele){
                System.out.print(x+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,0,8},{9,1,1,2},{0,1,5,6}};
        int m = arr.length, n = arr[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        //marking rows and columns
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        //setting column to 0
        for(int i=0; i<m; i++){
            if(row[i]==true){
                for(int j=0; j<n; j++){
                    arr[i][j]=0;
                }
            }
        }
        //setting row to 0
        for(int j=0; j<n; j++){
            if(col[j]==true){
                for(int i=0; i<m; i++){
                    arr[i][j]=0;
                }
            }
        }
        print(arr);
    }
}
