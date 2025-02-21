package Strings.StringBiulder;

public class MaxOccurence {
    public static void main(String[] args) {
        String s = "souptikabairagya";
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){  //traversing in string
            freq[(int)s.charAt(i)-97]++;
        }
        for(int i=0; i<freq.length; i++){
            System.out.print((char)(i+97)+"="+freq[i]+" ");
        }
        int maxFreq = Integer.MIN_VALUE;
        for(int i=0; i<freq.length; i++){
            maxFreq = Math.max(maxFreq, freq[i]);
        }
        System.out.println("\nMaximum Frequency:-");
        for(int i=0; i<freq.length; i++){
            if(freq[i]==maxFreq) {
                System.out.println((char)(i+97)+"="+maxFreq);
            }
        }
    }
}
