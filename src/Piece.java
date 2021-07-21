public abstract class Piece {
    /**
     * true = white, false = black
     */
    private boolean color;
    public Piece(boolean color){
        this.color = color;
    }

    public boolean getColor(){
        return color;
    }

}
