package Arrays;

public class sortZeroesnOnes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,0,0,0,0,1};
        int n = arr.length;
        //Method1- Two Pass Solution OR Forced Solution
        int noOfZeroes = 0;
        for(int ele : arr){
            if(ele==0) noOfZeroes++;
        }
//      //Syntax1
//        for(int i=0; i<noOfZeroes; i++){
//            arr[i] = 0;
//        }
//        for(int j=noOfZeroes; j<n; j++){
//            arr[j] = 1;
//        }

        // Syntax2
        for(int i=0; i<n; i++){
            if(i<noOfZeroes) arr[i]=0;
            else arr[i]=1;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        //Method2- One Pass Solution
        int[] brr = {1,0,0,1,1,0};
        int m = brr.length;
        int i=0, j=m-1;
        while(i<j){
            if(brr[i]==0) i++;
            if(brr[j]==1) j--;
            if(i<j && brr[i]==1 && brr[j]==0){
                brr[i]=0;
                brr[j]=1;
                i++;
                j--;
            }
        }
        for(int elf : brr){
            System.out.print(elf+ " ");
        }
        System.out.println();
    }
}
