package Prefix_Sum;
//Leetcode 1248
import java.util.HashMap;

public class CountNoOfNiceSubarrays {
    static int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        for(int i=0; i<n; i++) nums[i] %= 2; //converting given array into binary array
        //now we will be checking the number of subarrays whose sum is equal to k
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int[] pre = new int[n];
        pre[0] = nums[0];
        for (int i = 1; i < n; i++) pre[i] = nums[i] + pre[i - 1];
        for (int i = 0; i < n; i++) {
            if (pre[i] == k) count++;
            int rem = pre[i] - k;
            if (map.containsKey(rem)) {
                int freq = map.get(rem);
                count += freq;
            }
            if (map.containsKey(pre[i])) {
                int freq = map.get(pre[i]);
                map.put(pre[i], freq + 1);
            } else map.put(pre[i], 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        System.out.println(numberOfSubarrays(arr,k));
    }
}
