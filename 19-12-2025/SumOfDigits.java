import java.util.*;
class SumOfDigits {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        while(n > 0) {
            s += n % 10;
            n = n / 10;
        }
        System.out.println(s);
    }
}