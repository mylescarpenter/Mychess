public class Board {
    /**
     * board holds Piece information for each square on the chess board.
     * [0][0] is top left square
     */
    private Square[][] board;

    public Board(){
        board = new Square[8][8];
    }

    public void reset(){
        for(int col = 0; col <= 7; ++col){
            board[1][col] = new Square(1, col, new Pawn(false));
        }
        for(int col = 0; col <= 7; ++col){
            board[6][col] = new Square(6, col, new Pawn(true));
        }
        board[0][0] = new Square(0, 0, new Rook(false));
        board[0][7] = new Square(0, 7, new Rook(false));
        board[7][0] = new Square(7, 0, new Rook(true));
        board[7][7] = new Square(7, 7, new Rook(true));
        board[0][1] = new Square(0, 1, new Knight(false));
        board[0][6] = new Square(0, 6, new Knight(false));
        board[7][1] = new Square(7, 1, new Knight(true));
        board[7][6] = new Square(7, 6, new Knight(true));
        board[0][2] = new Square(0, 2, new Bishop(false));
        board[0][5] = new Square(0, 5, new Bishop(false));
        board[7][2] = new Square(7, 2, new Bishop(true));
        board[7][5] = new Square(7, 5, new Bishop(true));
        board[0][3] = new Square(0, 3, new Queen(false));
        board[7][3] = new Square(7, 3, new Queen(true));
        board[0][4] = new Square(0, 4, new King(false));
        board[7][4] = new Square(7, 4, new King(true));


    }

    public void print(){
        for(int row = 0; row <= 7; ++row){
            for(int col = 0; col <= 7; ++col){
                if(board[row][col] == null) System.out.print('x');
                else System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }

    /**
     * moves piece at x1, y1 to location x2, y2 and sets x1, y1 space == null (or empty), (indexed at 0 from top left corner)
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public void move(int x1, int y1, int x2, int y2){
        board[x2][y2] = board[x1][y1];
        board[x1][y1] = null;
    }

    public boolean isValid(String move){
        return true;
    }

    public String checkState(){
        return "";
    }

    public Square get(int x, int y){
        return board[x][y];
    }

    public void edit(Square square){

    }
}
