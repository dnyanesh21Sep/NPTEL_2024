import java.util.*;

public class Week8Assignment4 
{
  public static void main(String[] args) 
 {
    Scanner inr = new Scanner(System.in);
    int l = inr.nextInt();
 
    int k;
    if (l % 2 == 0) 
      System.out.print("Invalid line number");
    else 
    {
      for (int i = 0; i < l; i++) 
      {
        k = 0;
        if (i <= l / 2) 
        {
          for (int j = l - i; j > l / 2 + 1; j--) 
          {
            System.out.print(" ");
          }
          while (k < (i + 1)) 
          {
            System.out.print("*" + " "); 
            k++;
          }
        } 
        else 
        {
          for (int j = l - i; j < l / 2 + 1; j++)
            System.out.print(" ");
          while (k < (l - i)) 
          { 
            if (k == l - i - 1)
              System.out.print("*");
            else 
            {
              System.out.print("*");
              System.out.print(" ");
            }
            k++;
          }
        }
        if (i != l - 1)
          System.out.println();
      }
    }
  }
}
