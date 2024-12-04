import java.util.*;

public class Week12Assignment3 
{
    public static void main(String[] args) 
  {
        Scanner s1 = new Scanner(System.in);

        String firstName = s1.next();

        String lastName = s1.next();

        int rollno = s1.nextInt();

        float sub1 = s1.nextFloat();

        float sub2 = s1.nextFloat();

        float avg = (float) ((sub1 + sub2) / 2.0);

        System.out.print(firstName + lastName + " " + rollno + " " + avg);
    }
}
