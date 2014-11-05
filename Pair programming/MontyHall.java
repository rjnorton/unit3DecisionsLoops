import java.util.Random;

public class MontyHall
{
    public static void main (String [] args)
    {
        Random rand = new Random();
        
        int switchY = 0;
        int switchN = 0;
        
        String playerDoor = " ";
        for (int i = 0; i<1000; i++)
        {
            playerDoor = " ";
            int door = rand.nextInt(3);
            if ( door == 1 )
            {
                switchN++;
            }
            else
            {
                switchY++;
            }
        }   
        System.out.println("The number of times switching wins: "+ switchY);
        System.out.println("The number of times switching loses: "+ switchN);
    }
}
