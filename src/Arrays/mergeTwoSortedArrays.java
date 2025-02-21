package Arrays;

public class mergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {11,33,42,62};
        int[] brr = {26,54,69,81,94};
        int[] crr = new int[arr.length+brr.length];
        int i=0, j=0, k=0;
        while(i<arr.length && j<brr.length) {
            if (arr[i] <= brr[j]) {
                crr[k] = arr[i];
                i++;
                k++;
            } else {
                crr[k] = brr[j];
                j++;
                k++;
            }
        }
        if(i==arr.length){  //now take elements from brr only
            while(j<brr.length) {
                crr[k] = brr[j];
                j++;
                k++;
            }
        }
        if(j==brr.length) { //now take elements from arr only
            while(i<arr.length) {
                crr[k] = arr[i];
                i++;
                k++;
            }
        }
        for(int ele : crr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
