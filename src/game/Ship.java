package game;

public class Ship {
    
    int health;
    String name;
    int length;
    //the x,y coordinate is the upper left most of the ship
    int x;
    int y;
    //true is vertical, false is horizontal (could make this an enum)
    boolean vertical;
    
    Ship(String name, int length, int x, int y, boolean vertical) {
        this.name = name;
        this.length = length;
        this.x = x;
        this.y = y;
        this.vertical = vertical;
        health = length;
    }
    
    boolean hit() {
        health--;
        return(health <= 0);
    }
}
