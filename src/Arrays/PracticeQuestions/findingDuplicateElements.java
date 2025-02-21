package Arrays.PracticeQuestions;

public class findingDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {0,22,35,40,35,6,35,0,6};
        int n = arr.length;
        int Duplicate = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]!=Duplicate) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        Duplicate = arr[i];
                        System.out.println("Duplicate: " + Duplicate);
                        break;
                    }
                }
            }
        }
    }
}
