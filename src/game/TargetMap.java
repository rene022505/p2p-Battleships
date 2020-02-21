package game;

public class TargetMap {
    
    enum State {
        BLANK,
        HIT,
        MISS
    }
    
    State[][] map;
    
    int width;
    int height;
    
    TargetMap() {
        this.width = 10;
        this.height = 10;
        map = new State[width][height];
        wipe();
    }
    
    TargetMap(int width, int height) {
        this.width = width;
        this.height = height;
        map = new State[width][height];
        wipe();
    }
    
    //return false if coordinates already have a value
    boolean addHit(int x, int y) {
        if(map[x][y] == State.BLANK) {
            map[x][y] = State.HIT;
            return true;
        }
        return false;
    }
    
    State getState(int x, int y) {
        return map[x][y];
    }
    
    //return false if coordinates already have a value
    boolean addMiss(int x, int y) {
        if(map[x][y] == State.BLANK) {
            map[x][y] = State.MISS;
            return true;
        }
        return false;
    }
    
    //the State *should* default BLANK, but it's better to force it
    void wipe() {
        for(int x = 0; x < width; x++) {
            for(int y = 0; y < width; y++) {
                map[x][y] = State.BLANK;
            }
        }
    }
    
    
}
