package Sliding_Windows;
//Leetcode 713
public class SubArrayProductLessThanK {
    static int BruteForce(int[] nums, int k) {
        int count=0, n = nums.length;
        for(int i=0; i<n; i++){
            int pro=1;
            for(int j=i; j<n; j++){
                pro *= nums[j];
                if(pro<k) count++;
                else break;
            }
        }
        return count;
    }

    static int SlidingWindows(int[] nums, int k) {
        int n = nums.length, i=0, j=0, pro=1, count=0;
        if(k<=1) return 0;
        while(j<n){
            pro *= nums[j];
            if(pro<k) count += j-i+1;
            while(pro>=k) {
                i++;
                pro /= nums[i-1];
                if(pro<k) count += j-i+1;
            }
            j++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {10,9,10,4,3,8,3,3,6,2,10,10,9,3};
        int k = 19;
        System.out.println(BruteForce(nums,k));
        System.out.println(SlidingWindows(nums,k));
    }
}
