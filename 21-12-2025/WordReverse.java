
import java.util.*;
class WordReverse{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  String x=s.nextLine();
  String[] w=x.split(" ");
  for(int i=w.length-1;i>=0;i--){
   System.out.print(w[i]);
  }
 }
}