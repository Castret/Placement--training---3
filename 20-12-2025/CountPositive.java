import java.util.*;
class CountPositive {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for(int i=0;i<n;i++) {
            int x = sc.nextInt();
            if(x > 0)
                c++;
        }
        System.out.println(c);
    }
}