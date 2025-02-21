package Arrays_2D;

public class Basic2DArrays {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 1;  // 1  2  3
        arr[0][1] = 2;  // 4  5  6
        arr[0][2] = 3;  // 7  8  9
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        // printing row-wise
        for(int i=0; i<3; i++){ //rows
            for(int j=0; j<3; j++){ //columns
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
