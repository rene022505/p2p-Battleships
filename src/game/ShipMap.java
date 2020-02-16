package game;

public class ShipMap {
    
    int height;
    int width;
    int numShips;
    Ship[][] map;
    
    
    ShipMap() {
        height = 10;
        width = 10;
        numShips = 5;
        init();
    }
    
    ShipMap(int fleetSize) {
        height = 10;
        width = 10;
        numShips = fleetSize;
        init();
    }
    
    private void init() {
        map = new Ship[width][height];
    }
    
    Ship getShip(int x, int y) {
        return map[x][y];
    }
    
    /**
     * Attempts to add a ship to the board
     * if ship is successfully added, addShip returns true
     * 
     * @param name      the name of the ship class (ie submarine, carrier)
     * @param length    the length of the ship
     * @param x         the x-coordinate of the left-most
     * @param y         the y-coordinate of the top-most
     * @return          returns false if the ships placement is invalid
     */
    boolean addShip(String name, int length, int x, int y, boolean vertical) {
        //check if front is out of bounds
        if(x+2 > width || y+2 > height || x < 0 || y < 0) {
            return false;
        }
        //check if end is out of bounds
        if(vertical && y+length > height) {
            return false;
        }
        //check if end is out of bounds
        if(!vertical && x+length > width) {
            return false;
        }
        //check if grid is open
        if(vertical) {
            for(int i = 0; i < length; i++) {
                if(map[x][y+i] != null) {
                    return false;
                }
            }
        } else {
            for(int i = 0; i < length; i++) {
                if(map[x+i][y] != null) {
                    return false;
                }
            }
        }
        //room for ship, create ship
        Ship newShip = new Ship(name, length, x, y, vertical);
        //assign ship to grid
        if(vertical) {
            for(int i = 0; i < length; i++) {
                map[x][y+i] = newShip;
            }
        } else {
            for(int i = 0; i < length; i++) {
                map[x+i][y] = newShip;
            }
        }
        return true;
    }
    
    /**
     * Additional function that assigns a name
     * and passes it to addShip(String, int, int, int)
     * 
     * @param length    the length of the ship
     * @param x         the x-coordinate of the left-most
     * @param y         the y-coordinate of the top-most
     * @return          returns false if the ships placement is invalid
     */
    boolean addShip(int length, int x, int y, boolean vertical) {
        String name;
        switch (length) {
            case 2:
                name = "Destroyer";
                    break;
            case 3:
                name = "Cruiser";
                    break;
            case 4:
                name = "Battleship";
                    break;
            case 5:
                name = "Aircraft Carrier";
                    break;
            default:
                name = "Navy Prototype";
                    break;
        }
        return addShip(name, length, x, y, vertical);
    }
    
}
