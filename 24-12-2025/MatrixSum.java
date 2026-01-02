
import java.util.*;
class MatrixSum{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  int r=s.nextInt(),c=s.nextInt();
  int[][] m=new int[r][c];
  int sum=0;
  for(int i=0;i<r;i++){
   for(int j=0;j<c;j++){
    m[i][j]=s.nextInt();
    sum+=m[i][j];
   }
  }
  System.out.println(sum/c);
 }
}