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
public enum Direction {
     NORTH {
        public Position move(int x, int y) { return new Position(x, y + 1); }
        public Direction turnLeft() { return WEST; }
        public Direction turnRight() { return EAST; }
    },
    EAST {
        public Position move(int x, int y) { return new Position(x + 1, y); }
        public Direction turnLeft() { return NORTH; }
        public Direction turnRight() { return SOUTH; }
    },
    SOUTH {
        public Position move(int x, int y) { return new Position(x, y - 1); }
        public Direction turnLeft() { return EAST; }
        public Direction turnRight() { return WEST; }
    },
    WEST {
        public Position move(int x, int y) { return new Position(x - 1, y); }
        public Direction turnLeft() { return SOUTH; }
        public Direction turnRight() { return NORTH; }
    };

    public abstract Position move(int x, int y);
    public abstract Direction turnLeft();
    public abstract Direction turnRight();
    
}
