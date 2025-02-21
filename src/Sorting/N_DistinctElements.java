package Sorting;

public class N_DistinctElements {
    public static void main(String[] args) {
        int[] arr = {40,12,78,34,100,57,23};
        int n = arr.length;
        for(int x=0; x>-n; x--){  //loop runs n times to convert each element in order
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int i=0; i<n; i++){
                if(arr[i]<min && arr[i]>0){
                    min=arr[i];
                    mindx=i;
                }
            }
            arr[mindx]=x;
        }
        for(int i=0; i<n; i++){
            arr[i] *=-1;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
