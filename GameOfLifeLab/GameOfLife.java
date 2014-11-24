import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @Rob Norton
 * @version 10 November 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    private ActorWorld initialworld;
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 22;
    private final int COLS = 22;
    
    // constants for the location of the three cells initially alive
    private final int X1 = 11, Y1 = 5;
    private final int X2 = 11, Y2 = 6;
    private final int X3 = 11, Y3 = 7;
    private final int X4 = 10, Y4 = 8;
    private final int X5 = 12, Y5 = 8;
    private final int X6 = 9, Y6 = 9;
    private final int X7 = 13, Y7 = 9;
    private final int X8 = 8, Y8 = 10;
    private final int X9 = 14, Y9 = 10;
    private final int X10 = 5, Y10 = 11;
    private final int X11 = 6, Y11 = 11;
    private final int X12 = 7, Y12 = 11;
    private final int X14 = 10, Y14 = 11;
    private final int X15 = 12, Y15 = 11;
    private final int X16 = 15, Y16 = 11;
    private final int X17 = 16, Y17 = 11;
    private final int X18 = 17, Y18 = 11;
    private final int X19 = 11, Y19 = 10;
    private final int X20 = 11, Y20 = 12;
    private final int X21 = 8, Y21 = 12;
    private final int X22 = 14, Y22 = 12;
    private final int X23 = 13, Y23 = 13;
    private final int X24 = 9, Y24 = 13;
    private final int X25 = 10, Y25 = 14;
    private final int X26 = 12, Y26 = 14;
    private final int X27 = 11, Y27 = 15;
    private final int X28 = 11, Y28 = 16;
    private final int X29 = 11, Y29 = 17;

    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife() throws InterruptedException
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        initialworld = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
        for (int i = 0; i <=30; i++)
        {
            createNextGeneration();
            world.show();
            Thread.sleep(100);
        }
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(X4, Y4);
        grid.put(loc4, rock4);
                
        Rock rock5 = new Rock();
        Location loc5 = new Location(X5, Y5);
        grid.put(loc5, rock5);
        
        Rock rock6 = new Rock();
        Location loc6 = new Location(X6, Y6);
        grid.put(loc6, rock6);
        
        Rock rock7 = new Rock();
        Location loc7 = new Location(X7, Y7);
        grid.put(loc7, rock7);
        
        Rock rock8 = new Rock();
        Location loc8 = new Location(X8, Y8);
        grid.put(loc8, rock8);
        
        Rock rock9 = new Rock();
        Location loc9 = new Location(X9, Y9);
        grid.put(loc9, rock9);
        
        Rock rock10 = new Rock();
        Location loc10 = new Location(X10, Y10);
        grid.put(loc10, rock10);
        
        Rock rock11 = new Rock();
        Location loc11 = new Location(X11, Y11);
        grid.put(loc11, rock11);
        
        Rock rock12 = new Rock();
        Location loc12 = new Location(X12, Y12);
        grid.put(loc12, rock12);
        

        
        Rock rock14 = new Rock();
        Location loc14 = new Location(X14, Y14);
        grid.put(loc14, rock14);
        
        Rock rock15 = new Rock();
        Location loc15 = new Location(X15, Y15);
        grid.put(loc15, rock15);
        
        Rock rock16 = new Rock();
        Location loc16 = new Location(X16, Y16);
        grid.put(loc16, rock16);
        
        Rock rock17 = new Rock();
        Location loc17 = new Location(X17, Y17);
        grid.put(loc17, rock17);
        
        Rock rock18 = new Rock();
        Location loc18 = new Location(X18, Y18);
        grid.put(loc18, rock18);
        
        Rock rock19 = new Rock();
        Location loc19 = new Location(X19, Y19);
        grid.put(loc19, rock19);
        
        Rock rock20 = new Rock();
        Location loc20 = new Location(X20, Y20);
        grid.put(loc20, rock20);
        
        Rock rock21 = new Rock();
        Location loc21 = new Location(X21, Y21);
        grid.put(loc21, rock21);
        
        Rock rock22 = new Rock();
        Location loc22 = new Location(X22, Y22);
        grid.put(loc22, rock22);
        
        Rock rock23 = new Rock();
        Location loc23 = new Location(X23, Y23);
        grid.put(loc23, rock23);
        
        Rock rock24 = new Rock();
        Location loc24 = new Location(X24, Y24);
        grid.put(loc24, rock24);
        
        Rock rock25 = new Rock();
        Location loc25 = new Location(X25, Y25);
        grid.put(loc25, rock25);
        
        Rock rock26 = new Rock();
        Location loc26 = new Location(X26, Y26);
        grid.put(loc26, rock26);
        
        Rock rock27 = new Rock();
        Location loc27 = new Location(X27, Y27);
        grid.put(loc27, rock27);
        
        Rock rock28 = new Rock();
        Location loc28 = new Location(X28, Y28);
        grid.put(loc28, rock28);
        
        Rock rock29 = new Rock();
        Location loc29 = new Location(X29, Y29);
        grid.put(loc29, rock29);
        
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        BoundedGrid<Actor> gridnew = new BoundedGrid<Actor>(ROWS, COLS);
        
        
        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLS; j++)
            {
                Location newloc = new Location(i,j);
                Actor newact = grid.get(newloc);
                if (newact == null)
                {
                    ArrayList<Actor> neighbors = grid.getNeighbors(newloc);
                    int len = neighbors.size();
                    if (len == 3)
                   {
                    Rock newrock = new Rock();
                    gridnew.put(newloc, newrock);
                   }
                }
                
                else
                {
                    ArrayList<Actor> neighbors1 = grid.getNeighbors(newloc);
                    int length = neighbors1.size();
                    if (length == 2 || length == 3)
                    {
                        Rock newrock1 = new Rock();
                        gridnew.put(newloc,newrock1);
                    }
                }
                }
            }
        world.setGrid(gridnew);
        }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    /**
     * Returns the initial actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getInitialActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = initialworld.getGrid().get(loc);
        return actor;
    }
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        GameOfLife game = new GameOfLife();
    }

}
