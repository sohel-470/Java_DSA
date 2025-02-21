package Arrays;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12,8,60,37,2,49,16,28,21};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;
        //Method 1 : Brute Force
//        for(int i=0; i<n-1; i++){
//            int max = Integer.MIN_VALUE;
//            for(int j=i+1; j<n; j++){
//                max = Math.max(arr[j],max);
//            }
//            ans[i] = max;
//        }
        //Method 2 : Optimised Solution
        int nge = arr[n-1];  //nge = next greatest element
        for(int i=n-2; i>=0; i--){  //Reverse Traversing
            ans[i] = nge;
            nge=Math.max(arr[i],nge);
        }
        for(int ele : ans){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
