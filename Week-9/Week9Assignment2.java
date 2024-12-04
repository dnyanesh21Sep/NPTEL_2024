import java.util.Scanner;

public class Week9Assignment2 
{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    String num1 = "", num2 = "";
    char op = 'a';
    int equal = 0, flag = 0, check = 0, j = 0, ch = 0;
    char[] charArray = input.toCharArray();
    char[] numarray = new char[input.length()];
    
    for (int i = 0; i < input.length(); i++) 
    {
      if (charArray[i] < 'a' || charArray[i] > 'p') 
      {
        check = 1;
        break;
      }
      
      if (charArray[i] == 'c')
        ch = 1;
      char out = gui_map(charArray[i]);
      numarray[i] = out;
      
      if (out == '+' || out == '-' || out == 'X' || out == '/') {
        flag = 1;
        op = out;
      }
      
      if (flag == 0)
        num1 = num1 + String.valueOf(out);
      else 
      {
        if (j == 0) 
        {
          j++;
          continue;
        }
        
        if (out == '=') 
        {
          equal = 1;
          break;
        }
        num2 = num2 + String.valueOf(out);
      }
    }
    
    if (ch == 1 && check == 0) 
    {
      double a = Double.parseDouble(num1);
      double b = Double.parseDouble(num2);
      if (op == '+')
        System.out.print(a + b);
      else if (op == '-')
        System.out.print(a - b);

      else if (op == 'X')
        System.out.print(a * b);

      else if (op == '/')
        System.out.print(a / b);

    }
  }
  
  static char gui_map(char in)
  {
    char out = 'N';
    char gm[][] = { { 'a', '.' }, { 'b', '0' }, { 'c', '=' }, { 'd', '+' }, { 'e', '1' }, { 'f', '2' }, { 'g', '3' },
        { 'h', '-' }, { 'i', '4' }, { 'j', '5' }, { 'k', '6' }, { 'l', 'X' }, { 'm', '7' }, { 'n', '8' }, { 'o', '9' },
        { 'p', '/' } };

    for (int i = 0; i < gm.length; i++) 
    {
      if (gm[i][0] == in) 
      {
        out = gm[i][1];
        break;
      }
    }
    return out;
  }
}
