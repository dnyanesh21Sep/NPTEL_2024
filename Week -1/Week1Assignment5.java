import java.util.Scanner;
public class Week1Assignment5 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double mark_avg;
        int result;
        int i;
        int s;
        
        s = input.nextInt();
        int[] arr = new int[s]; 
        for (i = 0; i < arr.length; i++) 
        {
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        double sum = arr[0];
        
        for (i = 1; i < arr.length; i++) 
        {
            sum = sum + arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        result = max;
        mark_avg = sum / (arr.length);
        System.out.println(result); 
        System.out.println(mark_avg);
    }
}
