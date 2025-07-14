package POTD;
import java.util.*;

public class Leetcode_594 {
    static int findLHS(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i=0, j=0, k=0, changed=0, max=0;
        while(j<n){
            if(nums[i]==nums[j]) j++;
            else if(nums[j]-nums[i]==1){
                if(changed==0){
                    k=j;
                    changed++;
                }
                j++;
            }
            else{
                System.out.println(j-i);
                max = Math.max(max,j-i);
                if(changed==0) i=j;
                else i=k;
                k=j;
                changed=0;
                j++;
            }
        }
        System.out.println(j-i);
        max = Math.max(max,j-i);
        if(i==0 && j==n && k==0) return 0;
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1,4,1,3,1,-14,1,-13};
        System.out.println(findLHS(nums));
    }
}
