package Sliding_Windows;

public class MaxSumSubArrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {10,20,1,3,-40,80,10};
        int k=3;
        int n = arr.length, max = Integer.MIN_VALUE, idx=-1;
        //Brute Force Method--> TC= O(n*k)
        for(int i=0; i<=n-k; i++){
            int sum=0;
            for(int j=i; j<=i+k-1; j++){
                sum += arr[j];
            }
            if(sum>max) {
                max = sum;
                idx=i;
            }
        }
        for(int i=idx; i<=idx+k-1; i++) System.out.print(arr[i]+" ");
        System.out.println();
        System.out.println(max);

        //Sliding Windows Method-> TC = O[k+(n-k)] = O(n)
        max = Integer.MIN_VALUE; idx=-1;
        int sum=0;
        for(int i=0; i<=k-1; i++) sum += arr[i];
        int i=1, j=i+k-1;
        while(j<n){
            sum = sum - arr[i-1] + arr[j];
            if(sum>max) {
                max = sum;
                idx = i;
            }
            i++; j++;
        }
        for(int l=idx; l<=idx+k-1; l++) System.out.print(arr[l]+" ");
        System.out.println();
        System.out.println(max);
    }
}
