package Arrays;

public class passingArrayToMethods {
    public static void main(String[] args) {
        int arr[] = {90, 56, 25, 69, 75, 15, 37, 74, 30, 89};
        System.out.println(arr[0]);
        change(arr[0]);
        System.out.println(arr[0]);
    }
        static void change(int x){
            x = 10;
        }
}
