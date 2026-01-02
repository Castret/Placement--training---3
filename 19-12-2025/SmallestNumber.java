import java.util.*;
class SmallestNumber {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1;i<n;i++) {
            int x = sc.nextInt();
            if(x < m)
                m = x;
        }
        System.out.println(m);
    }
}