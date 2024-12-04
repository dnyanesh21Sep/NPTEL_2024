public class Week6Assignment1 extends Thread 
{ 
  public void start() 
  {
    System.out.print("Thread is Running.");
  }

  public static void main(String args[]) 
  {
    Week6Assignment1 thread = new Week6Assignment1();
    thread.start();
  }
}
