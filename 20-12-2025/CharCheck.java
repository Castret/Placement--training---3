import java.util.*;
class CharCheck {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c >= 'a' && c <= 'z')
            System.out.println("lower");
        else
            System.out.println("upper");
    }
}