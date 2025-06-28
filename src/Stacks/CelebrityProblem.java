package Stacks;

import java.util.Stack;

public class CelebrityProblem {
    static int celebrity(int arr[][]) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i=0; i<n; i++) st.push(i);
        while(st.size()>1){
            int v1 = st.pop();
            int v2 = st.pop();
            if(arr[v1][v2]==0) st.push(v1);//v1 is a potential candidate
            else if(arr[v1][v2]==1) st.push(v2);//v2 is a potential candidate
        }
        if(st.isEmpty()) return -1;
        //now, only the potential candidate is left in the stack. so, check for it
        int potential = st.pop();
        for(int j=0; j<n; j++){
            if(j==potential) continue;
            if(arr[potential][j]==1) return -1;
        }
        for(int i=0; i<n; i++) if(arr[i][potential]==0) return -1;
        return potential;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        System.out.println(celebrity(arr));
    }
}
