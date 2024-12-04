class Printer 
{
    public void print() 
    {
        System.out.println("Hi! I class SCHOOL.");
    }

    public void print(String s) 
    {
        System.out.println(s);
    }
}

public class Week2Assignment2 
{
    public static void main(String[] args) 
    {
        Printer ob = new Printer();
        ob.print("Hi! I am class STUDENT"); 
        Printer ob1 = new Printer(); 
        ob1.print(); 
    }
}
