import java.util.*;
class LongestCommonPrefix{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  s.nextLine();
  String[] w=new String[n];
  for(int i=0;i<n;i++) w[i]=s.nextLine();
  String p=w[0];
  for(int i=1;i<n;i++){
   while(w[i].indexOf(p)!=0){
    p=p.substring(0,p.length()-1);
    if(p.length()==0) break;
   }
  }
  System.out.println(p);
 }
}
