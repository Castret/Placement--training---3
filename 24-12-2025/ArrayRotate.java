
import java.util.*;
class ArrayRotate{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int[] x=new int[n];
  for(int i=0;i<n;i++) x[i]=s.nextInt();
  int k=s.nextInt();
  for(int i=0;i<k;i++){
   int t=x[0];
   for(int j=0;j<n-1;j++) x[j]=x[j+1];
   x[n-1]=t;
  }
  for(int i=0;i<n;i++) System.out.print(x[i]+" ");
 }
}