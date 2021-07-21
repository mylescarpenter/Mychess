public class Knight extends Piece{
    public Knight(boolean color){
        super(color);
    }

    public String toString(){
        if(super.getColor())
            return "N";
        else return "n";
    }
}
