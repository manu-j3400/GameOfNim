/**
 * Game Class for the Game of Nim
 */
public class Game {
    private Player player1;
    private Player player2;

    public Game() {
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
    }

    public void play() {
        Player currentPlayer = player1;

        while (Board.getStones() > 0) {
            System.out.println("There are " + Board.getStones() + " stones left.");
            int stonesToRemove = currentPlayer.makeMove();
            Board.removeStones(stonesToRemove);
            System.out.println(currentPlayer.getName() + " removed " + stonesToRemove + " stones.");

            // switch players
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }

        System.out.println("Game over! " + currentPlayer.getName() + " wins!");
    }
}