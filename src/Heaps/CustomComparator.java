package Heaps;
import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int rno;
    double per;
    Student(String name, int rno, double per){
        this.name = name;
        this.rno = rno;
        this.per = per;
    }
    //Custom comparator is used when we want to perform an operation with respect to specific component of an object.
    public int compareTo(Student s){
//        return this.rno - s.rno; //compare wrt rno
//        return (int)(this.per - s.per); //compare wrt percentage
        return this.name.charAt(0) - s.name.charAt(0); //compare wrt 1st char of name
    }
}
public class CustomComparator {
    public static void print(Student[] s){
        for(int i=0; i<s.length; i++)
            System.out.println(s[i].name+"  "+s[i].rno+"  "+s[i].per+"%");
        System.out.println();
    }
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student("Sohel",25,95.7);
        s[1] = new Student("Soup",26,96.1);
        s[2] = new Student("Khush",69,97.9);
        s[3] = new Student("Argha",48,98.4);
        print(s);
        Arrays.sort(s);
        print(s);
    }
}


