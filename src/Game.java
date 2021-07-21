public class Game {

    private Board board;

    public Game(){
        Board board = new Board();
    }

    public void start(){
        System.out.println("Welcome to chess by Myles Carpenter\nPlease choose one of the options" +
                " below by choosing the corresponding number\n1) Start game\n2) Quit");
    }
}
