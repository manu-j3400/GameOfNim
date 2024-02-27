/**
 * Board Class for the Game of Nim
 */
public class Board {
    private static int stones = 15; // initial number of stones

    public static void populate() {
        stones = 15;
    }

    public static int getStones() {
        return stones;
    }

    public static void removeStones(int num) {
        stones -= num;
    }
}
