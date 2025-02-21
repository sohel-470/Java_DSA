package Arrays;

import static java.lang.Math.max;

public class AdditionOfArrays {
    public static void main(String[] args) {
        int[] arr = {1,9,9,9}; int[] brr = {3,4,6};
        int m = arr.length, n = brr.length;
        int[] res = new int[max(m,n)];
        int i=m-1, j=n-1, x=0;
        while(i>=0 && j>=0){
            res[max(i,j)] = (arr[i]+brr[j]+x)%10;
            x=(arr[i]+brr[j]+x)/10;
            i--; j--;
            if(i<0){
                while(j>=0){
                    res[j] = (brr[j]+x)%10;
                    x=(brr[j]+x)/10;
                    j--;
                }
            }
            else if(j<0){
                while(i>=0){
                    res[i] = (arr[i]+x)%10;
                    x=(arr[i]+x)/10;
                    i--;
                }
            }
        }
        for(int ele:res){
            System.out.print(ele+" ");
        }
    }
}
