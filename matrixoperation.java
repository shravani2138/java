import java.util.Scanner;

class matrix
{
  public static void main(String[] args)
     {
		int a[][] = new int [2][2];
		int b[][] = new int [2][2];
		Scanner sc = new Scanner(System.in);

void getmatrixele1()
	  {
		System.out.print("enter first matrix ");
		for(int i=0;i<2;i++)
		   { 
			for(int j=0;j<2;j++)
			   {
				System.out.print(a[i][j] + " " );
                     }
               }
		a = sc.Scanner.nextInt();
        } 
void getmatrixele2()
	  {
		System.out.print("enter second matrix ");
		for(int i=0;i<2;i++)
		   { 
			for(int j=0;j<2;j++)
			   {
				System.out.print(b[i][j] + " " );
                     }
               }
		b = sc.Scanner.nextInt();
        } 
void addmatrix()
	  {
		for(int i=0;i<2;i++)
		   { 
			for(int j=0;j<2;j++)
			   {
				int c = a[i][j] + b[i][j];
				System.out.print("addition of matrices " + c);
                     }
               }
		c = sc.Scanner.nextInt();
        } 
void submatrix()
	  {
		for(int i=0;i<2;i++)
		   { 
			for(int j=0;j<2;j++)
			   {
				int d = a[i][j] - b[i][j];
				System.out.print("subtraction of matrices " + d);
                     }
               }
		d = sc.Scanner.nextInt();
        } 
void mulmatrix()
	  {
		for(int i=0;i<2;i++)
		   { 
			for(int j=0;j<2;j++)
			   {
				for(int k=0;k<2;k++)
		   
			          {
				        int e = a[i][k] * b[k][j];
				        System.out.print("multiplication of matrices " + e);
				    }
                     }
               }
		e = sc.Scanner.nextInt();
        } 
class matrixoperation
{
	public static void main(string[] args)
       {
		matix m = new matrix();

		m.getmatrixele1();
		m.getmatrixele2();
		m.addmatrix();
		m.submatrix();
		m.mulmatrix();
	}
}
}
}