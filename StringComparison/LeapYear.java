import java.util.Scanner;

public class LeapYear
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = s.nextInt();
        boolean leap = isLeapYear(year);
        if (leap){System.out.println("That is a leap year");}
        else {System.out.println("That is not a leap year");}
    }
    
    public static boolean isLeapYear(int year)
    {
        int check400 = year % 400;
        int check100 = year % 100;
        int check4 = year % 4;
        
        if ((check100 != 0) && (check400 == 0 || check4 == 0))
        {
            return true;
        }
        
        else {return false;
    }
}
}
