package Sliding_Windows;

public class LongestSubArray__1493 {
    static int longestSubarray(int[] nums) {
        int n = nums.length, i=0, j=0, len=Integer.MIN_VALUE, initialzero=0;
        while(i<n && nums[i]==0) {
            initialzero++;
            i++;
        }
        if(i==n) return 0;
        j=i;
        int noz = 0;
        while(j<n){
            if(nums[j]==1)  j++;
            else { //nums[j]==0
                if(noz==0){
                    noz++;
                    j++;
                }
                else { //noz==1
                    len = Math.max(len,j-i-1);
                    j++;
                    while(nums[i]==1) i++;
                    i++;
                }
            }

        }
        if(noz==1) len = Math.max(len,j-i-1);
        if(initialzero==0 && noz==0) return n-1;
        if(initialzero!=0 && noz==0) return j-i;
        return len;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(arr));
    }
}
