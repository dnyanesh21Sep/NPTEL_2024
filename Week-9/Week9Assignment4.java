import java.util.Scanner;

public class Week9Assignment4 
{
  public static void main(String args[]) 
 {
    Scanner sc = new Scanner(System.in);

    String a[] = new String[5];

    char r[][] = new char[5][5];

    int i, j, k = 0;
    for (j = 0; j < 5; j++)
      a[j] = sc.nextLine();

    for (i = 0; i < 5; i++)
      for (j = 4, k = 0; j >= 0; j--, k++)
        r[i][k] = a[i].charAt(j);
  
    for (i = 0; i < 5; i++) 
    {
      for (k = 0; k < 5; k++)
        System.out.print(r[i][k]);
      System.out.println();

    }
  } 
} 
