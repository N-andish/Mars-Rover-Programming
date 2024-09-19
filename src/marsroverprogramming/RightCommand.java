/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsroverprogramming;

/**
 *
 * @author localadmin
 */
// RightCommand implements the turn right functionality
public class RightCommand implements Command {
     private Rover rover;

    public RightCommand(Rover rover) {
        this.rover = rover;
    }


    @Override
    public void execute() {
        rover.turnRight();
    }
    
}
