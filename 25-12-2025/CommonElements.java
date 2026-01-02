import java.util.*;
class CommonElements{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  int n=s.nextInt(),m=s.nextInt();
  int[] x=new int[n];
  int[] y=new int[m];
  for(int i=0;i<n;i++) x[i]=s.nextInt();
  for(int i=0;i<m;i++) y[i]=s.nextInt();
  for(int i=0;i<n;i++){
   for(int j=0;j<m;j++){
    if(x[i]==y[j]){
     System.out.print(x[i]+" ");
     break;
    }
   }
  }
 }
}
