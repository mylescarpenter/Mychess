public class Square {
    /**
     * true = white, false = black
     */
    private Piece piece;
    private int row;
    private int col;

    /**
     *
     * @param row - rank, row of square(indexed at 0)
     * @param col - file, column of square(indexed at 0)
     * @param piece - the piece located on space; if no piece, equals null
     */
    public Square(int row, int col, Piece piece){
        this.piece = piece;
        this.row = row;
        this.col = col;
    }

    public String toString(){
        return piece.toString();
    }

    /*public boolean isOccupied(){

    }*/

}
