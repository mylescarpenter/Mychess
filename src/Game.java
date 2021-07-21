import java.util.Scanner;

/**
 * Game
 * @author mylescarpenter
 * @date 21 July, 2021
 * Game class controls the whole chess game by, accepting user input, simulating the moves, updating the game board,
 * and declaring a winner and loser or a draw when the game state warrants it
 */
public class Game {
    /** holds board data*/
    private Board board;
    /** collects user input */
    private Scanner in;

    /**
     * constructs new game instance and initializes a Board and Scanner
     */
    public Game(){
        board = new Board();
        in = new Scanner(System.in);
    }

    /**
     * the initial method used to run the game
     * Home menu of game, gives options to start game or quit the game
     */
    public void run(){
        String input;
        boolean valid = false;

        System.out.println("Welcome to chess by Myles Carpenter\nPlease choose one of the options" +
                " below by choosing the corresponding number\n1) Start game\n2) Quit");
        while(!valid) {
            input = in.next();
            if (input.equals("1")) {
                valid = true;
                start();
            }
            else if (input.equals("2")) {
                valid = true;
                quit();}
            else System.out.println("Invalid input, try again");
        }
    }

    /**
     * starts a chess game, white moves first
     */
    public void start(){
        /**
         * gameActive is true while the game is live and false when the game has been
         * completed(either one side has won or the players have drawn)
         */
        boolean gameActive = true;
        /** turn is true when it is white's turn and false when it is black's turn */
        boolean turn = true;
        board.reset();
        board.print();
        while(gameActive){

        }
    }

    public void quit(){
        System.out.print("Thanks for playing!");
    }
}