import java.util.*;
class RemoveSpaces {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = "";
        for(int i=0;i<s.length();i++)
            if(s.charAt(i) != ' ')
                r += s.charAt(i);
        System.out.println(r);
    }
}