package Strings.StringBiulder;

import com.sun.security.jgss.GSSUtil;

public class stringBuilderBasics {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcd");
        sb.setCharAt(2,'g');
        System.out.println(sb);

        sb.append(32);  //appending Integers
        System.out.println(sb);
        sb.append("xyz");  //appending String
        System.out.println(sb);
        char[] ch = {'S', 'o', 'h'};
        sb.append(ch);  //appending Char Array
        System.out.println(sb);
        StringBuilder t = new StringBuilder("PQR");
        sb.append(t);  //appending StringBuilder
        System.out.println(sb);

        StringBuilder s = new StringBuilder("abcdefg");
        s.deleteCharAt(3);  //abcefg
        System.out.println(s);
        s.delete(1,4);  //delete index (1,3) --> afg
        System.out.println(s);
        s.insert(1,'z');  //azfg
        System.out.println(s);

        StringBuilder tb = new StringBuilder("abcdef");
        tb.reverse();
        System.out.println(tb);
    }
}
