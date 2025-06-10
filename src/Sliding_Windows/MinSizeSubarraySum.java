package Sliding_Windows;

public class MinSizeSubarraySum {
    static int BruteForce(int target, int[] nums) {
        int n = nums.length, len=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum += nums[j];
                if(sum>=target){
                    len = Math.min(len,j-i+1);
                    break;
                }
            }
        }
        if(len==Integer.MAX_VALUE) return 0;
        return len;
    }

    static int SlidingWindow(int k, int[] nums) {
        int n = nums.length, len=Integer.MAX_VALUE;
        int i=0, j=0, sum=0;
        while(j<n){ //First Window
            sum += nums[j];
            if(sum>=k) break;
            j++;
        }
        if(j==n) return 0;
        len = j-i+1;
        while(j<n){ //Sliding Window
            i++;
            sum -= nums[i-1];
            if(sum>=k) len = Math.min(len,j-i+1);
            else {
                j++;
                if(j<n){
                    sum += nums[j];
                    if(sum>=k) len = Math.min(len,j-i+1);
                }
            }
        }
        if(len==Integer.MAX_VALUE) return 0;
        return len;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(BruteForce(target,arr));
        System.out.println(SlidingWindow(target,arr));
    }
}
