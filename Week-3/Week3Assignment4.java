import java.util.Scanner;

class QuestionScope 
{
    int sum(int a, int b) 
    { 
        return a + b;
    }
    static int multiply(int a, int b) 
    {
        return a * b;
    }
}
public class Week3Assignment4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        QuestionScope st = new QuestionScope(); 
                          
        int result1 = st.sum(n1, n2);
        int result2 = QuestionScope.multiply(n1, n2); 
        
        System.out.println(result1);
        System.out.println(result2);
    }
}
