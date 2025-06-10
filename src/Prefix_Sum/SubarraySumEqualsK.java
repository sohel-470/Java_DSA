package Prefix_Sum;

import java.util.HashMap;

//Leetcode 560
public class SubarraySumEqualsK {
    static int BruteForce(int[] nums, int k) {
        int count=0, n = nums.length;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum += nums[j];
                if(sum==k) count++;
            }
        }
        return count;
    }

    static int PrefixSum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0, n = nums.length;
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
            }
            else map.put(pre[i], 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,-3,0,7,8,-1};
        int k = 7;
        System.out.println(PrefixSum(arr,k));
        System.out.println(BruteForce(arr,k));
    }
}
