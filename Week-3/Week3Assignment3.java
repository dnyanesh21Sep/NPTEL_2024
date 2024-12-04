import java.util.Scanner;

class Shape 
{
    double length, breadth;

    Shape(double l, double b) 
    {
        length = l;
        breadth = b;
    }

    Shape(double len) 
    { 
        length = breadth = len;
    }

    double calculate() 
    {
        return length * breadth;
    }
}

public class Week3Assignment3 extends Shape 
{
    double height;

    Week3Assignment3(double length, double h) 
    {
        super(length);
        height = h;
    }
    Week3Assignment3(double length, double breadth, double h) 
    {
        super(length, breadth);
        height = h;
    }

    double calculate() 
    {
        return length * breadth * height;
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
                                      
        double l = sc.nextDouble(); 
        double b = sc.nextDouble(); 
        double h = sc.nextDouble();
        
        Week3Assignment3 myshape1 = new Week3Assignment3(l, h);
        Week3Assignment3 myshape2 = new Week3Assignment3(l, b, h);
        
        double volume1;
        double volume2;
        
        volume1 = myshape1.calculate();
        volume2 = myshape2.calculate();
        System.out.println(volume1);
        System.out.println(volume2);
    }
}
