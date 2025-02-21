package Arrays_2D;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4},{5,6},{7,8}};
        int m = arr.length, n = arr[0].length;
        //Row-wise printing
        System.out.println("Main Matrix:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

        //Column-wise printing & storing Transpose
        int[][] transpose = new int[n][m];
        System.out.println("Transpose:");
        for(int j=0; j<n; j++){  // columns fixed
            for(int i=0; i<m; i++){ // rows variable
                System.out.print(arr[i][j]+"  ");
                transpose[j][i] = arr[i][j];
            }
            System.out.println();
        }
        System.out.println();

        //Storing transpose in a new array

        for(int[] ele:transpose){
            for(int x :ele){
                System.out.print(x+"  ");
            }
            System.out.println();
        }
    }
}
