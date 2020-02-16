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
    
    TargetMap(int width, int height) {
        this.width = width;
        this.height = height;
        map = new State[width][height];
    }
    
    
}
