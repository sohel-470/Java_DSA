package Arrays;

public class Max_Min_Index_Array {
    public static void main(String[] args) {
        int[] arr = {10,-4,20,1,-6,8};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxdx = -1;
        int mindx = -1;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
                maxdx = i;
            }
            if(arr[i]<min){
                min = arr[i];
                mindx = i;
            }
        }
        System.out.println("Minimun Value: "+min+"\nIndex: "+mindx);
        System.out.println("Maximun Value: "+max+"\nIndex: "+maxdx);
    }
}
