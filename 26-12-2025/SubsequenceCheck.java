import java.util.*;
class SubsequenceCheck{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  String x=s.nextLine();
  String y=s.nextLine();
  int i=0,j=0;
  while(i<x.length() && j<y.length()){
   if(x.charAt(i)==y.charAt(j)) i++;
   j++;
  }
  System.out.println(i==x.length());
 }
}
