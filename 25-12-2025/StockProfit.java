import java.util.*;
class StockProfit{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int[] p=new int[n];
  for(int i=0;i<n;i++) p[i]=s.nextInt();
  int min=p[0],m=0;
  for(int i=1;i<n;i++){
   if(p[i]-min>m) m=p[i]-min;
   if(p[i]<min) min=p[i];
  }
  System.out.println(m);
 }
}
