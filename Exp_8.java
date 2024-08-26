import java.util.Scanner;

class Exp_8 {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        Scanner s = new Scanner(System.in);
        int a = 10;
        int[] arr = new int[5];
        int c;
//try
//{
//c=a/b;
//System.out.println(c);
//}

//catch(Exception e)
//{
//System.out.println(e);
//}
//System.out.println("end a program ");
//}


        
        for (int i = 0; i < arr.length; i++)
	 {
            System.out.println("Enter an integer for index " + i + ":");
            arr[i] = s.nextInt();
        }

       
        for (int i = 0; i < arr.length; i++) {
            try {
                c = arr[i] / a;
                System.out.println("div is :" +c);
            } 
             catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println("End of the program");
      
    }
}