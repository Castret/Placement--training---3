import java.util.*;
class PowerCalc {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p = 1;
        for(int i=0;i<y;i++)
            p = p * x;
        System.out.println(p);
    }
}