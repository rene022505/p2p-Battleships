package game;

public class TestController {

    ShipMap testBoard;
    
    public static void main(String[] args) {
        TestController test = new TestController();
        test.run();
    }
    
    private void run() {
        testBoard = PremadeBoardCreation.createBoard(0);
        printBoard();
    }
    
    private void printBoard() {
        for(int y = 0; y < testBoard.height; y++) {
            for(int x = 0; x < testBoard.width; x++) {
                if(testBoard.getShip(x,y) == null) {
                    System.out.print(0);
                } else {
                    System.out.print('X');
                }
            }
            System.out.println();
        }
    }
    
}
