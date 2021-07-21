public class King extends Piece{
    public King(boolean color){
        super(color);
    }

    public String toString(){
        if(super.getColor())
            return "K";
        else return "k";
    }
}
