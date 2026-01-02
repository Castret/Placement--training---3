import java.util.*;
class TwoSumIndex{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  int n=s.nextInt(),k=s.nextInt();
  int[] x=new int[n];
  for(int i=0;i<n;i++) x[i]=s.nextInt();
  for(int i=0;i<n;i++){
   for(int j=i+1;j<n;j++){
    if(x[i]+x[j]==k){
     System.out.println(i+" "+j);
     return;
    }
   }
  }
  System.out.println("-1");
 }
}

