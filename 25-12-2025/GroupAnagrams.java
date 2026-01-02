import java.util.*;
class GroupAnagrams{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  s.nextLine();
  String[] w=new String[n];
  for(int i=0;i<n;i++) w[i]=s.nextLine();
  boolean[] v=new boolean[n];
  for(int i=0;i<n;i++){
   if(v[i]) continue;
   char[] c=w[i].toCharArray();
   Arrays.sort(c);
   System.out.print(w[i]+" ");
   v[i]=true;
   for(int j=i+1;j<n;j++){
    char[] d=w[j].toCharArray();
    Arrays.sort(d);
    if(Arrays.equals(c,d)){
     System.out.print(w[j]+" ");
     v[j]=true;
    }
   }
   System.out.println();
  }
 }
}
