package Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem {
    static ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();//Here we will be pushing indices of arr[i]
        ArrayList<Integer> ans = new ArrayList<>();
        st.push(0);
        ans.add(1);
        for(int i=1; i<n; i++){
            if(arr[st.peek()]>arr[i]){
                ans.add(i,i-st.peek());
                st.push(i);
            }
            else{
                while(st.size()>0 && arr[st.peek()]<=arr[i]) st.pop();
                if(st.isEmpty()){
                    ans.add(i,i+1);
                    st.push(i);
                }
                else{
                    ans.add(i,i-st.peek());
                    st.push(i);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        System.out.println(calculateSpan(arr));
    }
}
