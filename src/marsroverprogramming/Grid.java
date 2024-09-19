/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsroverprogramming;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author localadmin
 */
public class Grid {
    private final int width, height;
    private final Set<Position> obstacles = new HashSet<>();

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addObstacle(Position position) {
        obstacles.add(position);
    }

    public boolean isObstacle(Position position) {
        return obstacles.contains(position);
    }
    
}
