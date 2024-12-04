public class Week6Assignment2 implements Runnable 
{
  @Override
  public void run() 
 {
    System.out.print(Thread.currentThread().getName() + " has ended.");
  }

  public static void main(String args[]) 
 {
    System.out.println("Welcome to Java Week 6 New Question.");
    Week6Assignment2 Runnable = new Week6Assignment2(); 
    Thread Rename = new Thread(Runnable); 
    Rename.setName("Main Thread"); 
    Rename.start();
  }
}
