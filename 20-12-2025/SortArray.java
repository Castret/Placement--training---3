import java.util.*;
class SortArray {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++)
            x[i] = sc.nextInt();
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                if(x[i] > x[j]) {
                    int t = x[i];
                    x[i] = x[j];
                    x[j] = t;
                }
        for(int i=0;i<n;i++)
            System.out.print(x[i]+" ");
    }
}