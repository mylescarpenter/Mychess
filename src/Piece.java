/**
 * abstract class Piece
 * @author mylescarpenter
 * date 21 July 2021
 * class provides common methods and variables used among pieces, such as color and movement
 */

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
//public void move(){
//
//    }

}
