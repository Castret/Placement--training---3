
import java.util.*;
class VowelCount{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  String x=s.nextLine();
  int c=0;
  for(int i=0;i<x.length();i++){
   char ch=x.charAt(i);
   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    c++;
  }
  System.out.println(c);
 }
}