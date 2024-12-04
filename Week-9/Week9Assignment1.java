import java.util.Scanner;

public class Week9Assignment1 
{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    int i = 0;
    int j = 0;
    double k = 0;

    char s[] = input.toCharArray();

    for (int a = 0; a < s.length; a++) 
    {
      if (s[a] == '+')

      {
        i = Integer.parseInt(input.substring(0, a));

        j = Integer.parseInt(input.substring(a + 1, s.length));

        k = (double) i + j;
      }
        
      else if (s[a] == '-')
      {
        i = Integer.parseInt(input.substring(0, a));
        j = Integer.parseInt(input.substring(a + 1, s.length));
        k = (double) i - j;
      }

      else if (s[a] == '*') {
        i = Integer.parseInt(input.substring(0, a));
        j = Integer.parseInt(input.substring(a + 1, s.length));
        k = (double) i * j;
      } 
      
      else if (s[a] == '/') {
        i = Integer.parseInt(input.substring(0, a));
        j = Integer.parseInt(input.substring(a + 1, s.length));
        k = (double) i / j;
      }
    }
    System.out.print(input + " = " + Math.round(k));
  }
}
