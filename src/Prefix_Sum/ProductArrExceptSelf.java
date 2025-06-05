package Prefix_Sum;
//LEETCODE 238
public class ProductArrExceptSelf {
    static void print(int[] arr ){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n]; //left side product(excluding nums[i])
        int[] suff = new int[n]; //right side product(excluding nums[i])
        int[] ans = new int[n];
        pre[0]=1; suff[n-1]=1;
        for(int i=1; i<n; i++) pre[i]=nums[i-1] * pre[i-1];
        for(int i=n-2; i>=0; i--) suff[i] = nums[i+1] * suff[i+1];
        for(int i=0; i<n; i++) ans[i] = pre[i]*suff[i];
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        print(productExceptSelf(arr));
    }
}
