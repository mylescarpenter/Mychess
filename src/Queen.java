public class Queen extends Piece{
    public Queen(boolean color){
        super(color);
    }

    public String toString(){
        if(super.getColor())
            return "Q";
        else return "q";
    }
}
