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
// LeftCommand implements the turn left functionality
public class LeftCommand implements Command {
    private Rover rover;

    public LeftCommand(Rover rover) {
        this.rover = rover;
    }
    

    

    @Override
    public void execute() {
        rover.turnLeft();
    }
    
}
