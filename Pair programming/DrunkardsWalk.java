import java.util.Random;

public class DrunkardsWalk
{
   public static void main(String[] args)
   {
       Random rand = new Random();
       
       int x = 0;
       int y = 0;
       int nextDir = 0;
       for (int j = 0; j < 20; j++)
       {
           for (int i = 0; i < 100; i++)
           {
               nextDir = rand.nextInt(4);
               
               if (nextDir == 0)
               {
                   x -= 1;
               }
               else if (nextDir == 1)
               {
                   x += 1;
               }
               else if (nextDir == 2)
               {
                   y -= 1;
               }
               else
               {
                   y += 1;
               }
           }

       System.out.println("(x,y): ("+x+","+y+")");
   }
}
}
