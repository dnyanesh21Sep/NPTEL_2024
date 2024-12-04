public class Week6Assignment5 extends Thread 
{
  public void run() {
  }
  public static void main(String args[]) 
  {
    Week6Assignment5 t1 = new Week6Assignment5();
    System.out.println("Name of thread 't1':" + t1.getName());

    Week6Assignment5 t2 = new Week6Assignment5();
    System.out.println("Name of thread 't2':" + t2.getName());

    t1.setName("Week 6 Assignment Q5");
    t2.setName("Week 6 Assignment Q5 New");
    System.out.println("New name of thread 't1':" + t1.getName());
    System.out.println("New name of thread 't2':" + t2.getName());
  }
}
