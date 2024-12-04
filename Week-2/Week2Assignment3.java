public class Week2Assignment3 
{
    public static void main(String[] args) 
    {
        Week2Assignment3 q = new Week2Assignment3();
        q.studentMethod();
    }

    void print(Week2Assignment3 object) 
    {
        System.out.print("Well Done!");
    }

    public void studentMethod() 
    { 
        Week2Assignment3 q = new Week2Assignment3();
        q.print(q); 
    }
}
