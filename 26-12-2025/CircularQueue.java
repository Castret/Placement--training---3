import java.util.*;
class CircularQueue{
 static int f=-1,r=-1,n=5;
 static int[] q=new int[n];
 public static void main(String[] a){
  ins(10);
  ins(20);
  ins(30);
  del();
  ins(40);
  for(int i=0;i<n;i++) System.out.print(q[i]+" ");
 }
 static void ins(int x){
  if((r+1)%n==f) return;
  if(f==-1) f=0;
  r=(r+1)%n;
  q[r]=x;
 }
 static void del(){
  if(f==-1) return;
  if(f==r){ f=-1; r=-1; }
  else f=(f+1)%n;
 }
}
