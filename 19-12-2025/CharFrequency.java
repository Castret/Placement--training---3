import java.util.*;
class CharFrequency {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0;i<s.length();i++) {
            int c = 0;
            for(int j=0;j<s.length();j++)
                if(s.charAt(i) == s.charAt(j))
                    c++;
            System.out.println(s.charAt(i)+" "+c);
        }
    }
}