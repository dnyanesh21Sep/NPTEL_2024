class Pair 
{
    private int a, b;
    public Pair() 
    {
        a = 0;
        b = 0;
    }

    synchronized public int sum() 
    { 
        return (a + b);
    }

    synchronized public void inc() 
    { 
        a++;
        b++;
    }
}

public class Week6Assignment4 extends Thread 
{
    public final int COUNT = 1000;
    private Pair pair;

    public Week6Assignment4(Pair pair) 
    {
        this.pair = pair;
    }

    public void run() 
    {
        for (int i = 0; i < COUNT; i++) 
        {
            pair.inc();
        }
    }

    public static void main(String args[]) 
    {
        Pair pair = new Pair();
        Week6Assignment4 w1 = new Week6Assignment4(pair);
        Week6Assignment4 w2 = new Week6Assignment4(pair);
        Week6Assignment4 w3 = new Week6Assignment4(pair);
        w1.start();
        w2.start();
        w3.start();

        try 
        {
            w1.join();
            w2.join();
            w3.join();
        } 
        catch (InterruptedException ignored) 
        { }

        System.out.println("Final sum:" + pair.sum());
    }
}
