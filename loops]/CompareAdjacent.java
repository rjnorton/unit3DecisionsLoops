import java.util.Scanner;

public class CompareAdjacent
{
    public static void main(String[] args)
    {
        final double EPSILON = 1e-7;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter numbers (q to quit): ");
        double prevVal = s.nextDouble();
        
        while (s.hasNextDouble())
        {
            double curVal = s.nextDouble();
            
            if (Math.abs(curVal - prevVal) < EPSILON)
            {System.out.println("Duplicate numbers: " + curVal);}
            
            prevVal = curVal;
        }
    }
}
