import java.util.*;
class GCDCalc {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        while(x != y) {
            if(x > y)
                x = x - y;
            else
                y = y - x;
        }
        System.out.println(x);
    }
}