import java.util.*;
class LongestIncreasingSub{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int[] x=new int[n];
  for(int i=0;i<n;i++) x[i]=s.nextInt();
  int m=1;
  for(int i=0;i<n;i++){
   int c=1;
   for(int j=i+1;j<n;j++){
    if(x[j]>x[j-1]) c++;
    else break;
   }
   if(c>m) m=c;
  }
  System.out.println(m);
 }
}
