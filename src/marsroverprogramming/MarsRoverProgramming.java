/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsroverprogramming;
import java.util.Scanner;
/**
 *
 * @author localadmin
 */
public class MarsRoverProgramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grid grid = new Grid(15, 15);
        grid.addObstacle(new Position(1, 2));
        grid.addObstacle(new Position(3, 0));

        // Initialize rover at position (0, 0) facing North
        Rover rover = new Rover(0, 0, Direction.NORTH, grid);

        // Create command instances
        Command moveCommand = new MoveCommand(rover);
        Command leftCommand = new LeftCommand(rover);
        Command rightCommand = new RightCommand(rover);

        // Execute commands
        moveCommand.execute();
        moveCommand.execute();
        rightCommand.execute();
        moveCommand.execute();
        leftCommand.execute();
        moveCommand.execute();

        // Report rover's final status
        rover.reportStatus();
    
        
    
    }
        
        // TODO code application logic here
    
    
}
