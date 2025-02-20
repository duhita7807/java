class StaticDemo 
{
    // Static variable
    static int count;
    
    // Static block
    static
	{
        System.out.println("Static block executed.");
        count = 10;
    }
    
    // Static method
    static void displayCount() 
	{
        System.out.println("Count: " + count);
    }
    
    StaticDemo()
	{
        count++;
    }
}

public class StaticExample
{
    public static void main(String[] args) 
	{
        StaticDemo.displayCount();
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo.displayCount();
    }
}
