import java.io.*;
import java.util.*; 

public class Week7Assignment4 
{
  public static void main(String[] args) 
  {
    int c = 0;
    try 
    {
      InputStreamReader r = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(r);
      String s1 = br.readLine();
     
      for (int i = 0; i < s1.length(); i++) 
      {
        char s = s1.charAt(i);
        if (s == 'a' || s == 'A' || s == 'e' || s == 'E' || s == 'i' || s == 'I' || s == 'o' || s == 'O' || s == 'u'
            || s == 'U') 
        { 
          c = c + 1;
        }
      }
      
      System.out.println(c);
    } 
    catch (Exception e) 
    {
      System.out.println(e);
    }
  }
}
