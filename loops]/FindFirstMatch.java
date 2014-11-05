import java.util.Scanner;
public class FindFirstMatch
{
    /** Finds the index of the first space ' ' in the string */
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       char again = 'y';
       System.out.println("Enter a string");
       String input = s.nextLine();   
       int index = 0;
       for (int i = 0; i < input.length(); i++)
       {
           char c = input.charAt(i);
           if (c == ' ')
           {break;}
           index++;
       }
       
       if (index == input.length())
       {
           System.out.println("There is never a space in the string");
       }
       
       else
       {
           System.out.println("The first occurence of a space is at index " + index + ".");
       }
   }

}
