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
// Rover class to represent the Rover's position and its movement on the grid
public class Rover {
    private int x, y;
    private Direction direction;
    private Grid grid;

    // Initialize Rover with position, direction, and grid
    public Rover(int x, int y, Direction direction, Grid grid) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.grid = grid;
    }

    public void move() {
        // Move the rover forward in the current direction
        Position newPosition = direction.move(x, y);
        if (!grid.isObstacle(newPosition)) {
            this.x = newPosition.getX();
            this.y = newPosition.getY();
        } else {
            System.out.println("Obstacle detected at (" + newPosition.getX() + ", " + newPosition.getY() + "), cannot move!");
        }
    }

    public void turnLeft() {
        this.direction = direction.turnLeft();
    }

    public void turnRight() {
        this.direction = direction.turnRight();
    }

    public void reportStatus() {
        System.out.println("Rover is at (" + x + ", " + y + ") facing " + direction);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    void reportStatus1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
