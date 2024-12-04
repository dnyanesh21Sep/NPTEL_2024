import java.util.*;

public class Week8Assignment3 
{
  public static void main(String[] args) 
  {
    Scanner inr = new Scanner(System.in);
    int n = inr.nextInt();

    int i, j, a, b, t = 1, sum = 0;
    b = n - 1;
          
    for (i = 1; i <= n; i++) 
    {
      int begin = 1;
      for (j = 1; j <= b; j++) 
      {
        System.out.print("  "); 
      }
      for (a = 1; a <= t; a++) 
      {
        System.out.print(begin + " "); 
        sum = begin + sum;
        begin++;
      }
      b--;
      t += 2;
      System.out.print("\n"); 
    }
    System.out.println(sum); 
  }
}
