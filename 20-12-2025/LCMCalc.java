import java.util.*;
class LCMCalc {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int m = x > y ? x : y;
        while(true) {
            if(m % x == 0 && m % y == 0)
                break;
            m++;
        }
        System.out.println(m);
    }
}