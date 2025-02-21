package Pattern_Printing;

import java.util.Scanner;

public class Binary_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){


                if(i%2!=0){     //i is odd
                    if(j%2!=0)  //j is also odd
                        System.out.print("1 ");
                    else        //j is even
                        System.out.print("o ");
                }


                else {        //i is even
                    if(j%2==0)//j is also even
                        System.out.print("1 ");
                    else      //j is odd
                        System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
