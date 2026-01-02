import java.util.*;
class RotateMatrix90{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int[][] m=new int[n][n];
  for(int i=0;i<n;i++)
   for(int j=0;j<n;j++)
    m[i][j]=s.nextInt();
  for(int i=0;i<n;i++){
   for(int j=n-1;j>=0;j--)
    System.out.print(m[j][i]+" ");
   System.out.println();
  }
 }
}
