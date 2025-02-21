package Arrays;

public class Max_Min_Array {
    public static void main(String[] args) {

        int arr[] = {90,56,25,69,75,15,37,74,30,89};
        int max = arr[0], min = arr[0], smax = Integer.MIN_VALUE, smin = Integer.MAX_VALUE; //returns max possible value integer
        for(int i=1; i<arr.length; i++){
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=max)
                smax = Math.max(arr[i], smax);
            if(arr[i]!=min)
                smin = Math.min(arr[i], smin);
        }
        System.out.println("Maximun : " +max);
        System.out.println("Second Maximun : " +smax);
        System.out.println("Minimun : " +min);
        System.out.println("Second Minimun : " +smin);
    }
}
