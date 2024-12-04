class Parent 
{
    public static void testClassMethod() 
    {
        System.out.println("The static method.");
    }

    public void testInstanceMethod() 
    {
        System.out.println("The instance method.");
    }
}

public class Week12Assignment4 extends Parent 
{
    public static void testClassMethod() {
    }

    public static void main(String[] args) 
    {
        Parent obj = new Parent();
        
        obj.testInstanceMethod();
        obj.testClassMethod();
    }
}
