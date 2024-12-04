import java.net.*;

public class Week12Assignment2 
{
   public static void main(String[] args) 
 {
      try 
      {
         URL url = new URL("http://www.Nptel.com/java-tutorial");

         System.out.println("Protocol: " + url.getProtocol()); 
         System.out.println("Host Name: " + url.getHost());

      } 
      catch (Exception e) 
      {
         System.out.println(e);
      }
   }
}
