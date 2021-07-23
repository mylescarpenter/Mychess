public class Square {
    /**
     * true = white, false = black
     */
    private Piece piece;
    private int row;
    private int col;

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
