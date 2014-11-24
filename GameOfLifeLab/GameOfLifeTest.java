
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @gcschmit
 * @version 19 July 2014
 */
public class GameOfLifeTest
{
    /**
     * Default constructor for test class GameOfLifeTest
     */
    public GameOfLifeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInitialState() throws InterruptedException
    {
        /* expected pattern for initial state
         *  (X: alive; -: dead)
         * 
         *    0 1 2 3 4 5 6 7 8 9 10 11 12
         *  0 - - - - - - x - - - - - -
         *  1 - - - - - - x - - - - - -
         *  2 - - - - - - x - - - - - -
         *  3 - - - - - x - x - - - - -
         *  4 - - - - x - - - x - - - -
         *  5 - - - x - - x - - x - - -
         *  6 x x x - - x - x - - x x x
         *  7 - - - x - - x - - x - - -
         *  8 - - - - x - - - x - - - -
         *  9 - - - - - x - x - - - - -
         *  10- - - - - - x - - - - - - 
         *  11- - - - - - x - - - - - -
         *  12- - - - - - x - - - - - -
         *  
         */
        
        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getInitialActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 5 && col == 11) ||
                        (row == 6 && col == 11) ||
                        (row == 7 && col == 11) ||
                        (row == 8 && col == 10) ||
                        (row == 8 && col == 12) ||
                        (row == 9 && col == 9) ||
                        (row == 9 && col == 13) ||
                        (row == 10 && col == 8) ||
                        (row == 10 && col == 14) ||
                        (row == 11 && col == 5) ||
                        (row == 11 && col == 6) ||
                        (row == 11 && col == 7) ||
                        (row == 11 && col == 15) ||
                        (row == 11 && col == 16) ||
                        (row == 11 && col == 17) ||
                        (row == 11 && col == 10) ||
                        (row == 11 && col == 12) ||
                        (row == 10 && col == 11) ||
                        (row == 12 && col == 11) ||
                        (row == 12 && col == 8) ||
                        (row == 12 && col == 14) ||
                        (row == 13 && col == 9) ||
                        (row == 13 && col == 13) ||
                        (row == 14 && col == 10) ||
                        (row == 14 && col == 12) ||
                        (row == 15 && col == 11) ||
                        (row == 16 && col == 11) ||
                        (row == 17 && col == 11))

                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }

    @Test
    public void testFinalState() throws InterruptedException
    /* expected pattern for final state
         *  (X: alive; -: dead)
         * 
         *    0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
         *  0 - - - - - - - - - - - - - - - - - - 
         *  1 - - - - - - - - - - - - - - - - - - 
         *  2 - - - - - - - - - - - - - - - - - - 
         *  3 - - - - - - - - - - - - - - - - - - 
         *  4 - - - - - - - - - X X X - - - - - - 
         *  5 - - - - - - - - - - - - - - - - - - 
         *  6 - - - - - - - - - - - - - - - - - - 
         *  7 - - - - - - - - - - - - - - - - - - 
         *  8 - - - - - - - - - - - - - - - - - - 
         *  9 - - - - - - - - - - - - - - - - - - 
         *  10- - - X - - - - - - - - - - - - - X 
         *  11- - - X - - - - - - - - - - - - - X 
         *  12- - - X - - - - - - - - - - - - - X 
         *  13- - - - - - - - - - - - - - - - - - 
         *  14- - - - - - - - - - - - - - - - - - 
         *  15- - - - - - - - - - - - - - - - - - 
         *  16- - - - - - - - - - - - - - - - - - 
         *  17- - - - - - - - - - - - - - - - - - 
         *  18- - - - - - - - - X X X - - - - - - 
         */
    {
        GameOfLife game1 = new GameOfLife();
        final int ROWS = game1.getNumRows();
        final int COLS = game1.getNumCols();
        
        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game1.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 10 && col == 4) ||
                        (row == 11 && col == 4) ||
                        (row == 12 && col == 4) ||
                        (row == 4 && col == 10) ||
                        (row == 4 && col == 11) ||
                        (row == 4 && col == 12) ||
                        (row == 10 && col == 18) ||
                        (row == 11 && col == 18) ||
                        (row == 12 && col == 18) ||
                        (row == 4 && col == 10) ||
                        (row == 4 && col == 11) ||
                        (row == 4 && col == 12) ||
                        (row == 18 && col == 10) ||
                        (row == 18 && col == 11)||
                        (row == 18 && col == 12))
                        
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                
                else
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }
    }