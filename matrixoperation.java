import java.util.Scanner;

class Matrix
{
  public static void main(String[] args)
     {
		int a[][] = new int [2][2];
		int b[][] = new int [2][2];
		Scanner sc = new Scanner(System.in);

void getmatrixele()
	  {
		System.out.print("enter first matrix element :");
		for(int i=0;i<2;i++)
		   { 
			for(int j=0;j<2;j++)
			   {
				a[i][j] = sc.netInt();
			   }
                     }
         }
		System.out.print("enter second matrix element :");
		for(int i=0;i<2;i++)
		   { 
			for(int j=0;j<2;j++)
			   {
				b[i][j] = sc.netInt();
                   	   }
                    }

     }
}
void addmatrix()
	  {
		System.out.print("\n addition of matrix :");
		for(int i=0;i<2;i++)
		   { 
			for(int j=0;j<2;j++)
			   {
				int c[i][j] = a[i][j] + b[i][j];
				System.out.print(c +" ");
                     }
		System.out.println();
               }
        } 
void submatrix()
	  {
		System.out.print("\n subtraction of matrix :");
		for(int i=0;i<2;i++)
		   { 
			for(int j=0;j<2;j++)
			   {
				int d[i][j] = a[i][j] - b[i][j];
				System.out.print(d + " ");
                     }
               }
        } 
void mulmatrix()
	  {	
		int e[][] = int[2][2];
		System.out.print("\n multiplication of matrix :");
		for(int i=0;i<2;i++)
		   { 
			for(int j=0;j<2;j++)
			   {
				e[i][j] = 0;
				for(int k=0;k<2;k++)
		   
			          {
				        e[i][j]+ = a[i][k] * b[k][j];
				  }
				  System.out.print(e[i][j] + " ");
                           }
			   System.out.println();
                   }
          } 
class Matrixoperation
{
	public static void main(string[] args)
       {
		matix M = new Matrix();

		M.getmatrixele();
		M.addmatrix();
		M.submatrix();
		M.mulmatrix();
	}
}
