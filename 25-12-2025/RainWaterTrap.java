import java.util.*;
class RainWaterTrap{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int[] h=new int[n];
  for(int i=0;i<n;i++) h[i]=s.nextInt();
  int w=0;
  for(int i=1;i<n-1;i++){
   int l=0,r=0;
   for(int j=0;j<=i;j++) l=Math.max(l,h[j]);
   for(int j=i;j<n;j++) r=Math.max(r,h[j]);
   w+=Math.min(l,r)-h[i];
  }
  System.out.println(w);
 }
}
