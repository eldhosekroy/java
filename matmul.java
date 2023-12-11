import java.util.*;
public class matmul{
  public static void main(String ar[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the order of matrix 1 (m x n) :");
    int m1=sc.nextInt();
    int n1=sc.nextInt();
    System.out.println("Enter the order of matrix 2 (m x n) :");
    int m2=sc.nextInt();
    int n2=sc.nextInt();
  if(m1!=n2){
      System.out.println("Matrix multiplication is not possible");
    }
    else{
      int a[][] =new int[m1][n1];
      int b[][] =new int[m2][n2];
      int c[][] =new int[m1][n2];
      System.out.println("Enter the elements of matrix 1");
      for(int i=0;i<m1;i++){
      for(int j=0;j<n1;j++){
          System.out.print("a["+i+"]["+j+"] :");
        a[i][j]=sc.nextInt();
        }
      }
      System.out.println("Enter the elements of matrix 2");
      for(int i=0;i<m1;i++){
      for(int j=0;j<n1;j++){
          System.out.print("b["+i+"]["+j+"] :");
        b[i][j]=sc.nextInt();
        }
      }
      for(int i=0;i<m1;i++){
      for(int j=0;j<n2;j++){
        c[i][j]=0;
        for(int k=0;k<n1;k++){
          c[i][j]+=a[i][k]*b[k][j];
          }
        }
      }
      System.out.println("RESULTANT MATRIX");
      for(int i=0;i<m1;i++){
      for(int j=0;j<n2;j++){
          System.out.print(c[i][j]+"\t\t");
        }
        System.out.println();
      }
    }
  }
}
