import java.util.Scanner;
public class CountMatches
{
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       
       System.out.println("Enter a string");
       String input = s.nextLine();
       
       int spaces = 0;
       
       for (int i = 0; i < input.length(); i++)
       {
           char c = input.charAt(i);
           if (c == ' ')
           {spaces++;}
       }
       
       System.out.println("Number of spaces in string: " + spaces);
   }

}
