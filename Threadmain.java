import java.util.*;
import java.io.*;

class Mythread extends Thread
{
	public void run() {
	     for(int i = 1; i<=5; i++)
	        {
			System.out.println("Thread A : " + i);
		  }
			try
		      {
				Thread.sleep(1000);
		      }
		      catch(InterruptedException e)
		      {
				System.out.println(e);
		      }
		}
}
class Anotherthread extends Thread
{
	public void run() {
	     for(int i=1; i<=5; i++)
	     	  {
			System.out.println("Thread B : " + i);
	        }

			try
		      {
				Thread.sleep(1000);
		      }
		      catch(InterruptedException e)
		      {
				System.out.println(e);
		      }
	     }
}

class Threadmain {
	public static void main(String[] args){
		Thread mythread = new Mythread();
		mythread.start();

		Thread anotherthread = new Anotherthread();
		anotherthread.start();
	}
}