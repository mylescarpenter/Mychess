public class Pawn extends Piece {

    public Pawn(boolean color){
        super(color);
    }

    public String toString(){
        if(super.getColor())
            return "P";
        else return "p";
    }
}
