import java.util.*;
class PowerSet{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  String x=s.nextLine();
  int n=x.length();
  for(int i=0;i<(1<<n);i++){
   String r="";
   for(int j=0;j<n;j++){
    if((i&(1<<j))!=0) r+=x.charAt(j);
   }
   System.out.println(r);
  }
 }
}
