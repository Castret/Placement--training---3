import java.util.*;
class BinaryToDecimal {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1, s = 0;
        while(n > 0) {
            s += (n % 10) * p;
            p = p * 2;
            n = n / 10;
        }
        System.out.println(s);
    }
}