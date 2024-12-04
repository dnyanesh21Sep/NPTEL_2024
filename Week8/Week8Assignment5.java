import java.util.*;

public class Week8Assignment5 
{
  public static void main(String[] args) throws Exception 
 {
    Scanner inr = new Scanner(System.in);
    int n = inr.nextInt();

    if (n == 5) {
      System.out.println(" _ ");
      System.out.println("|" + "_ ");
      System.out.println(" _" + "|");
    }
    if (n == 4) {
      System.out.println("   ");
      System.out.println("|_|");
      System.out.println("  |");
    }
    if (n == 1) {
      System.out.println("  |");
      System.out.println("  |");
    }
    if (n == 6) {
      System.out.println(" _ ");
      System.out.println("|_ ");
      System.out.print("|_|");
    }
    if (n == 3) {
      System.out.println(" _ ");
      System.out.println(" _|");
      System.out.print(" _|");
    }
    if (n == 2) {
      System.out.println(" _ ");
      System.out.println(" _|");
      System.out.print("|_");
    }
    if (n == 0) {
      System.out.println(" _ ");
      System.out.println("| |");
      System.out.println("|_|");
    }
    if (n == 7) {
      System.out.println(" _ ");
      System.out.println("  |");
      System.out.print("  |");
    }
    if (n == 8) {
      System.out.println(" _ ");
      System.out.println("|_|");
      System.out.print("|_|");
    }
    if (n == 9) {
      System.out.println(" _ ");
      System.out.println("|_|");
      System.out.print(" _|");
    }
  }
}
