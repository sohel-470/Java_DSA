package Queue;
//GFG: First negative in every window of size k

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeInWindow {
    static List<Integer> firstNegInt(int arr[], int k) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++) if(arr[i]<0) q.add(i);
        if(q.isEmpty()){
            for(int i=0; i<=n-k; i++) ans.add(0);
            return ans;
        }
        for(int i=0; i<=n-k; i++){
            if(q.isEmpty()){
                for(int j=i; j<=n-k; j++) ans.add(0);
                return ans;
            }
            if(q.peek()<i) q.remove();
            if(q.size()>0 && q.peek()>=i && q.peek()<=i+k-1) ans.add(arr[q.peek()]);
            else ans.add(0);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        System.out.println(firstNegInt(arr,k));
    }
}
