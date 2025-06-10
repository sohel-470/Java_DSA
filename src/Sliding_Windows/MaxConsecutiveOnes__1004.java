package Sliding_Windows;

public class MaxConsecutiveOnes__1004 {
    static int longestOnes(int[] nums, int k) {
        int n = nums.length, i=0, j=0, len=0, noz=0;
        while(j<n) {
            if (nums[j] == 0) noz++;
            while (noz > k) {
                if (nums[i] == 0) noz--; //only noz no. of zeroes are allowed within the window
                i++;
            }
            len = Math.max(len, j-i+1);
            System.out.println(i);
            //System.out.println(len);
            j++;
        }
        return len;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(arr,k)+" ans");
    }
}
