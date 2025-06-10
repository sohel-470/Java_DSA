package Sliding_Windows;

public class GrumpyBookstoreOwner {
    static int maxSatisfied(int[] crr, int[] grr, int k) {
        int n = crr.length, i=0, j=0, uscount=0, maxuns=0, satisfied=0;
        if(k==n) {
            for(i=0; i<n; i++) satisfied += crr[i];
            return satisfied;
        }
        for(j=0; j<=k-1; j++){
            if(grr[j]==1) uscount += crr[j];
        }
        maxuns = Math.max(maxuns,uscount);
        int a=i, b=j;
        System.out.println(a+"  "+b);
        while(j<n){
            if(uscount>maxuns){
                maxuns = uscount;
                a=i; b=j;
            }
            i++; j++;
            if(grr[i-1]==1) uscount -= crr[i-1];
            if(j<n && grr[j]==1) uscount += crr[j];
            System.out.println(a+"  "+b);
            System.out.println(maxuns);
        }
        for(i=a; i<=b; i++) grr[i] = 0;

        for(i=0; i<n; i++){
            if(grr[i]==0) satisfied += crr[i];
        }
        return satisfied;
    }
    public static void main(String[] args) {
        int[] customer = {2,6,6,9};
        int[] grumpy = {0,0,1,1};
        int minutes = 1;
        System.out.println(maxSatisfied(customer,grumpy,minutes) +" ans");
    }
}
