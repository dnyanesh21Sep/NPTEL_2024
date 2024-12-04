import java.util.*;

public class Week8Assignment2 
{
  public static void main(String[] args) 
  {
    Scanner inr = new Scanner(System.in);
    int l = inr.nextInt();

    for (int i = 0; i < l; i++)
    {
      for (int j = l - i; j > 1; j--) 
      {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
