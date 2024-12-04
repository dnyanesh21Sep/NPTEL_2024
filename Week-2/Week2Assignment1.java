class School 
{
    public void print() 
    {
        System.out.println("Hi! I class SCHOOL.");
    }
}

class Student 
{
    public void print() 
    {
        System.out.println("Hi! I am class STUDENT");
    }
}

public class Week2Assignment1 
{
    public static void main(String args[]) 
    {

        Student student = new Student();
       
        student.print();
   
        School school = new School();

        school.print();
    }
}
