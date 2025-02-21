package Arrays;

public class Sort_Colours {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0};
        int n = arr.length;
        //Method1-Two Pass Solution
        int noOfZeroes=0, noOfOnes=0;
        for(int i=0; i<n; i++){
            if(arr[i]==0) noOfZeroes++;
            if(arr[i]==1) noOfOnes++;
        }
        for(int i=0; i<n; i++){
            if(i<noOfZeroes) arr[i]=0;
            else if(i<noOfOnes+noOfZeroes) arr[i]=1;
            else arr[i]=2;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        //Method2-Dutch Flag Algorithm OR One Pass Solution
        int[] brr = {0,0,0,0,1,1,2,0,2};
        int m = brr.length;
        int lo=0, mid=0, hi=m-1;
//        while(mid<=hi){
//            if(brr[mid]==0){
//                swap(brr, lo, mid);
//                lo++;
//                mid++;
//            }
//            else if(brr[mid]==1) mid++;
//            else {
//                swap(brr, mid, hi);
//                hi--;
//            }
//        }
        for(int i=0; i<m; i++){
            if(brr[mid]==0){
                swap(brr, lo, mid);
                lo++;
                mid++;
            }
            else if(brr[mid]==1) mid++;
            else{
                if(mid<hi) {
                    swap(brr, mid, hi);
                    hi--;
                }
            }
        }
        for(int ele : brr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void swap(int[] axx, int i, int j){
        int temp = axx[i];
        axx[i] = axx[j];
        axx[j] = temp;
    }
}
