public class Rook extends Piece{

    public Rook(boolean color){
        super(color);
    }

    public String toString(){
        if(super.getColor())
            return "R";
        else return "r";
    }

}
