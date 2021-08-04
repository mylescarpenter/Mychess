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
    private static Board board = new Board();
    /** collects user input */
    private static Scanner in = new Scanner(System.in);

    /**
     * constructs new game instance and initializes a Board and Scanner
     */
    public Game(){

    }

    /**
     * the initial method used to run the game
     * Home menu of game, gives options to start game or quit the game
     */
    public static void run(){
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
    private static void start(){
        /*
         * gameActive is true while the game is live and false when the game has been
         * completed(either one side has won or the players have drawn)
         */
        boolean gameActive = true;
        /* turn is true when it is white's turn and false when it is black's turn */
        boolean turn = true;
        board.reset();
        board.print();
        while(gameActive){

            //DEBUG
            if(turn) System.out.println("white's turn");
            if(!turn) System.out.println("black's turn");
            //DEBUG
            boolean moveValid = false;

            int x1 = 0;
            int y1 = 0;
            int x2 = 0;
            int y2 = 0;

           /* while(!moveValid){*/
                System.out.println("Enter x1: ");
                x1 = in.nextInt();
                System.out.println("Enter y1: ");
                y1 = in.nextInt();
                System.out.println("Enter x2: ");
                x2 = in.nextInt();
                System.out.println("Enter y2: ");
                y2 = in.nextInt();
                /*moveValid = board.isValid(input);*/
          /*  }*/

            board.move(x1, y1, x2, y2);

            if(board.checkState().equals("checkmate") || board.checkState().equals("stalemate")) gameActive = false;
            turn = !turn;
            board.print();
        }

        if(board.checkState().equals("stalemate")) System.out.println("The game is drawn");
        else if(board.checkState().equals("checkmate") && turn) System.out.println("White has won");
        else if(board.checkState().equals("checkmate") && !turn) System.out.println("Black has won");
        else System.out.println("Something went wrong");

        System.out.println("\nPress spacebar to return to menu");
        in.next();
        run();
    }

    private static void quit(){
        System.out.print("Thanks for playing!");
    }
}