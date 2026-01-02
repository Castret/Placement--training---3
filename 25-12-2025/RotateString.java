import java.util.*;
class RotateString{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  String x=s.nextLine();
  String y=s.nextLine();
  if(x.length()!=y.length()){
   System.out.println(false);
   return;
  }
  System.out.println((x+x).contains(y));
 }
}
