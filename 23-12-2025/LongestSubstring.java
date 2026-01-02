import java.util.*;
class LongestSubstring{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  String x=s.nextLine();
  int m=0;
  for(int i=0;i<x.length();i++){
   String t="";
   for(int j=i;j<x.length();j++){
    if(t.indexOf(x.charAt(j))!=-1) break;
    t+=x.charAt(j);
   }
   if(t.length()>m) m=t.length();
  }
  System.out.println(m);
 }
}
