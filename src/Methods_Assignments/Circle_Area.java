package Methods_Assignments;

import java.util.Scanner;
public class Circle_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double radius = sc.nextDouble();
        double res = circle(radius);
        System.out.println("Area  : " + res);
    }

    static double circle(double x) {
        return (Math.PI) * x * x;
    }
}
