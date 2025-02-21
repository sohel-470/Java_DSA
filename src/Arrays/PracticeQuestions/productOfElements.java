package Arrays.PracticeQuestions;

public class productOfElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int product = 1;
        for(int i=0; i<n; i++){
            product = arr[i]*product;
        }
        System.out.println("product = "+product);
    }
}
