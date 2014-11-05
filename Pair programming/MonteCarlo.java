import java.util.Random;

public class MonteCarlo
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        
        final double TRIES = 1000000;
        double x = 0;
        double y = 0;
        double success = 0;
        double xsquare;
        double ysquare;

        for (int i = 0; i < TRIES; i++)
        {
            x = ((rand.nextDouble())*2)-1;
            y = ((rand.nextDouble())*2)-1;
            xsquare = Math.pow(x,2);
            ysquare = Math.pow(y,2);
            
            if ((xsquare + ysquare) <= 1)
            {
                success++;
            }
        }
        
        double pi = 4 * (success/TRIES);
        
        System.out.println("PI is: " + pi);
    }
}
