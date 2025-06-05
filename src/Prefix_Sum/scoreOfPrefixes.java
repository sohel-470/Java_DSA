package Prefix_Sum;

public class scoreOfPrefixes { //leetcode 2640
    static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static int[] findPrefixScore(int[] nums) {
        int n = nums.length, max = nums[0];
        int[] conv = new int[n];
        conv[0] = 2*nums[0];
        for(int i=1; i<n; i++){
            max = Math.max(max,nums[i]);
            System.out.print(max+" ");
            conv[i] = nums[i] + max;
            System.out.print(conv[i]+" ");
            conv[i] += conv[i-1];
            System.out.println(conv[i]);
        }
        return conv;
    }
    public static void main(String[] args) {
        int[] nums = {16,11,11,11,19,6,6};
        print(findPrefixScore(nums));
    }
}
