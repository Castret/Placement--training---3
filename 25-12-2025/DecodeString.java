import java.util.*;
class DecodeString{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  String x=s.nextLine();
  Stack<Integer> c=new Stack<>();
  Stack<String> st=new Stack<>();
  String r="";
  int n=0;
  for(int i=0;i<x.length();i++){
   char ch=x.charAt(i);
   if(Character.isDigit(ch))
    n=n*10+(ch-'0');
   else if(ch=='['){
    c.push(n);
    st.push(r);
    r="";
    n=0;
   }else if(ch==']'){
    int k=c.pop();
    String t=st.pop();
    for(int j=0;j<k;j++) t+=r;
    r=t;
   }else r+=ch;
  }
  System.out.println(r);
 }
}
