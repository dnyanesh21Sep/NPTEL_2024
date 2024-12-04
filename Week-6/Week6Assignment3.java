interface A 
{
  public abstract void run();
}

class B implements A 
{
  public void run() {
  }
}

class MyThread extends B 
{
  public void run() 
  {
    System.out.print("NPTEL Java week-6 new Assignment Q3"); 
  }
}

public class Week6Assignment3 
{
  public static void main(String[] args) 
  {
    MyThread t = new MyThread();
    t.run();
  }
}
