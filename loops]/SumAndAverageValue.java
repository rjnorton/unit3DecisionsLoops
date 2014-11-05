import java.util.Scanner;

public class SumAndAverageValue
{
    /** This method computes the sum of a number of inputs then computes the average. */    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        double total = 0;
        int count = 0;
        
        System.out.println("Enter one number at a time or q to  quit.");
        
        while (s.hasNextDouble())
        {
            double value = s.nextDouble();
            total += value;
            count++;
        }
        
        double average = 0;
        if (count > 0) {average = total/count;}
        
        System.out.println("Total is: " + total);
        System.out.println("Average is: " + average);
    }
}
