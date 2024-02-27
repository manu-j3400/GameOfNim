import java.util.Scanner;

public class Player {
    private String name;
    private Scanner scanner;

    public Player(String name) {
        this.name = name;
        this.scanner = new Scanner(System.in);
    }

    public String getName() {
        return this.name;
    }

    public int makeMove() {
        System.out.println(this.name + ", enter the number of stones to remove (1-3): ");
        int stones = scanner.nextInt();
        while (stones < 1 || stones > 3) {
            System.out.println("Invalid move. Enter a number between 1 and 3: ");
            stones = scanner.nextInt();
        }
        return stones;
    }
}
