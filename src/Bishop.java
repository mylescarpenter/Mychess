public class Bishop extends Piece{
    public Bishop(boolean color){
        super(color);
    }

    public String toString(){
        if(super.getColor())
            return "B";
        else return "b";
    }
}
