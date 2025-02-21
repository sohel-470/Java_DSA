package Arrays_2D;

public class WavePrintMatrix {
    static void print(int[][] axx){
        for(int[] ele : axx){
            for(int x : ele){
                System.out.print(x + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m = arr.length, n = arr[0].length;
        System.out.println("Main Matrix:");
        print(arr);
        // Wave Print -> alternate row-wise printing
        System.out.println("WavePrint Matrix:");
        for(int i=0; i<m; i++){
            if(i%2==0){
                for(int j=0; j<n; j++){
                    System.out.print(arr[i][j]+"  ");
                }
                System.out.println();
            } else {
                for(int j=n-1; j>=0; j--){
                    System.out.print(arr[i][j]+"  ");
                }
                System.out.println();
            }
        }
    }
}
