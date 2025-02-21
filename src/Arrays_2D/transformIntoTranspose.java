package Arrays_2D;

public class transformIntoTranspose {

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
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        print(arr);
        //replacing by transpose works only for square matrices
        for(int i=0; i<m; i++){
            for(int j=0; j<i; j++){ //loop runs only for the lower-diag elements
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
    }
}
