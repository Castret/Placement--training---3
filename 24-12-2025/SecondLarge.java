
import java.util.*;
class SecondLarge{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int[] x=new int[n];
  for(int i=0;i<n;i++) x[i]=s.nextInt();
  Arrays.sort(x);
  System.out.println(x[n-2]);
 }
}