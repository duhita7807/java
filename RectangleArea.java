import java.util.*;
class Area 
{
    private double length;
    private double breadth;
 
    public void setDim(double l, double b) 
	{
        length = l;
        breadth = b;
    }

    public void getArea() 
	{
        System.out.println("Area of Rectangle="+length * breadth);
    }
}

public class RectangleArea
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double l = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        double b = sc.nextDouble();
        Area a1 = new Area();
        a1.setDim(l,b);
        a1.getArea();
        sc.close();
    }
}
