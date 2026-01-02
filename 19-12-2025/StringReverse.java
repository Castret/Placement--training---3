import java.util.*;
class StringReverse {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String r = "";
        for(int i=0;i<s.length();i++)
            r = s.charAt(i) + r;
        System.out.println(r);
    }
}