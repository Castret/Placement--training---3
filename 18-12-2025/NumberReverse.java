import java.util.*;
class NumberReverse {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String r = "";
        for(int i=0;i<n.length();i++)
            r = n.charAt(i) + r;
        System.out.println(r);
    }
}
