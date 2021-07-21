public class Square {
    /**
     * true = white, false = black
     */
    private Piece piece;
    private int row;
    private int col;

    public Square(int row, int col, Piece piece){
        this.piece = piece;
    }

    public String toString(){
        return piece.toString();
    }

}
