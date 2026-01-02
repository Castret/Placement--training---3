import java.util.*;
class CountDigits {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        while(n > 0) {
            c++;
            n = n / 10;
        }
        System.out.println(c);
    }
}