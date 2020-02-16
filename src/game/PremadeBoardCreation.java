package game;

final public class PremadeBoardCreation {
    
    private PremadeBoardCreation() {
        
    }
    
    static ShipMap createBoard(int model) {
        ShipMap gameBoard = new ShipMap();
        
        //no need to check for collision for these
        switch(model) {
            default:
                gameBoard.addShip(5, 1, 1, false);
                gameBoard.addShip(4, 6, 4, false);
                gameBoard.addShip("Submarine", 3, 1, 6, true);
                gameBoard.addShip(3, 3, 7, false);
                gameBoard.addShip(2, 8, 7, true);
            break;
        }
        return gameBoard;
    }
    
}
