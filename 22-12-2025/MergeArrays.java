import java.util.*;
class MergeArrays{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  int n=s.nextInt(),m=s.nextInt();
  int[] x=new int[n];
  int[] y=new int[m];
  for(int i=0;i<n;i++) x[i]=s.nextInt();
  for(int i=0;i<m;i++) y[i]=s.nextInt();
  for(int i=0;i<n;i++) System.out.print(x[i]+" ");
  for(int i=0;i<m;i++) System.out.print(y[i]+" ");
 }
}
