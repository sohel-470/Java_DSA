package Stacks;
//Leetcode 239
public class SlidingWindowMaximum {
    static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static int[] bruteForce(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        for(int i=0; i<=n-k; i++){
            int max = Integer.MIN_VALUE;
            for(int j=i; j<=i+k-1; j++){
                max = Math.max(max,nums[j]);
            }
            ans[i] = max;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k=3;
        print(bruteForce(nums,k));
    }
}
