import java.util.*;
class SimpleAverage {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for(int i=0;i<n;i++)
            s += sc.nextInt();
        System.out.println(s/n);
    }
}