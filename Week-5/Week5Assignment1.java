import java.util.Scanner;

interface Number 
{
    int findSqr(int i); 
}

class A implements Number 
{
    int i, square;

    public int findSqr(int i) 
    {
        square = i * i;
        return square; 
    }
}

public class Week5Assignment1 
{
    public static void main(String[] args) 
    {
        A a = new A(); 
        
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.print(a.findSqr(i)); 
    }
}
