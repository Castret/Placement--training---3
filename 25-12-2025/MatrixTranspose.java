import java.util.*;
class MatrixTranspose{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  int r=s.nextInt(),c=s.nextInt();
  int[][] m=new int[r][c];
  for(int i=0;i<r;i++)
   for(int j=0;j<c;j++)
    m[i][j]=s.nextInt();
  for(int j=0;j<c;j++){
   for(int i=0;i<r;i++)
    System.out.print(m[i][j]+" ");
   System.out.println();
  }
 }
}
