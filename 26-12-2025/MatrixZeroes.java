import java.util.*;
class MatrixZeroes{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  int r=s.nextInt(),c=s.nextInt();
  int[][] m=new int[r][c];
  boolean[] rr=new boolean[r];
  boolean[] cc=new boolean[c];
  for(int i=0;i<r;i++)
   for(int j=0;j<c;j++){
    m[i][j]=s.nextInt();
    if(m[i][j]==0){
     rr[i]=true;
     cc[j]=true;
    }
   }
  for(int i=0;i<r;i++)
   for(int j=0;j<c;j++)
    if(rr[i]||cc[j]) m[i][j]=0;
  for(int i=0;i<r;i++){
   for(int j=0;j<c;j++)
    System.out.print(m[i][j]+" ");
   System.out.println();
  }
 }
}
