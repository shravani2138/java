import MyMath.*;
import java.io.*;
public class PackDemo 
  {
    public static void main(String[] args)
	{
        Trig t = new Trig(45); 
        System.out.println("Sine: " + t.getSine());
        System.out.println("Cosine: " + t.getCosine());
        System.out.println("Tangent: " + t.getTangent());
        System.out.println("Secant: " + t.getSecant());
        System.out.println("Cosecant: " + t.getCosecant());
        System.out.println("Cotangent: " + t.getCotangent());

        Arithmetic a = new Arithmetic();
        System.out.println("Addition: " + a.add(10, 5));
        System.out.println("Subtraction: " + a.subtract(10, 5));
        System.out.println("Multiplication: " + a.multiply(10, 5));
        System.out.println("Division: " + a.divide(10, 5));

        double[] data = {1,2,3,4,5};
        Stat s = new Stat(data);
        System.out.println("Min: " + s.min());
        System.out.println("Max: " + s.max());
        System.out.println("Count: " + s.count());
        System.out.println("Sum: " + s.sum());
        System.out.println("Average: " + s.average());
    }
}
