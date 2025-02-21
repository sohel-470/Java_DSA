package Arrays_2D;

public class RotateBy_90_Degree {
    static void transpose(int[][] axx){
        int m = axx.length;
        for(int i=0; i<m; i++){
            for(int j=0; j<i; j++){
                int temp = axx[i][j];
                axx[i][j] = axx[j][i];
                axx[j][i] = temp;
            }
        }
    }
    static void print(int[][] axx){
        for(int[] ele:axx){
            for(int x:ele){
                System.out.print(x+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        System.out.println("Main Matrix:");
        print(arr);
        System.out.println("Transpose:");
        transpose(arr);
        print(arr);
        System.out.println("Rotate by 90 degrees:");
        for(int i=0; i<m; i++){
            for(int j=0; j<m/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][m-1-j];
                arr[i][m-1-j] = temp;
            }
        }
        print(arr);
    }
}
