
import java.util.Scanner;

 class Student
{
    int roll;
    String name;
    float marks;
    
     void Input()
    {
      Scanner obj1 = new Scanner(System.in);
      System.out.println("Enter your roll no");
      roll = obj1.nextInt();
      System.out.println("Enter your name");
      name = obj1.next();
      System.out.println("Enter your marks");
      marks = obj1.nextFloat();
      obj1.close();

    }

     void Display()
    {
       System.out.println("Name : " + name);
       System.out.println("Roll no :" + roll);
       System.out.println("Marks : " + marks);
    }

    public static void main(String[] args)
    {
        Student obj = new Student();
        obj.Input();
        obj.Display();
    } 
}
