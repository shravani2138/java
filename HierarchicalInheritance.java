class Animal
  {
     void eat() 
     {
	    System.out.println("eat");
     }
  }
class Dog extends Animal
   {
      void bark()
      {
           System.out.println("bark");
	}
  }
class Cat extends Animal
   {
      void meow()
	{
		System.out.println("meow");
	}
}
class HierarchicalInheritance{
public static void main(String args[])
{
    Cat c=new Cat();
    c.meow();
    c.eat();
}
}