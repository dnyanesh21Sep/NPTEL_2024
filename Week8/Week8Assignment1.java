import java.util.*;

public class Week8Assignment1 
{
  public static void main(String[] args) 
 {
    Scanner inr = new Scanner(System.in);
    int n = inr.nextInt();

    int a = 0, b = 0;
        
    for (int i = 1; i <= n; ++i, a = 0) 
    { 
      for (int j = 1; j <= n - i; ++j) 
      {
        System.out.print("  ");
      }
      while (a != 2 * i - 1) 
      { 
        System.out.print("* ");
        b = b + 1;
        ++a;
      }
      System.out.println();
    }
    System.out.println(b);
  }
}
