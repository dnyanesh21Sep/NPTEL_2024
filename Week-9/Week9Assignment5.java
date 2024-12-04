import java.util.Scanner;

public class Week9Assignment5 
{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);

    String a[] = new String[5];

    int i, j;

    char matrix[][] = new char[5][5];

    for (i = 0; i < 5; i++)
      a[i] = sc.nextLine();

    for (i = 0; i < 5; i++) 
    {
      char[] chararray = a[i].toCharArray();
      for (j = 0; j < 5; j++)
        matrix[i][j] = chararray[j];
    }
    for (i = 0; i < 5; i++) 
    {
      for (j = 0; j < 5; j++) 
      {
        if (matrix[i][j] == '0')
          System.out.print('1');
        else
          System.out.print('0');
      }
      System.out.println();
    }
  }
} 
