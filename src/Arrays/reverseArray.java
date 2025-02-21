package Arrays;

public class reverseArray {

    static void print(int[] axx){
        for(int ele:axx){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void swap(int[] axx, int x, int y){
        int temp = axx[x];
        axx[x] = axx[y];
        axx[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int m= arr.length;
        //using third variable
        for(int i=0; i<m/2; i++){
            swap(arr,i,m-1-i);
        }
        print(arr);

        //using two pointers
        int[] brr = {100,200,300,400,500,600,700};
        int n= brr.length;
        int i=0, j=n-1;
        while(i<j){  // OR  while(i<n/2 && j>n/2)
            swap(brr,i,j);
            i++;
            j--;
        }
        print(brr);
    }
}
