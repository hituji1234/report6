package jp.ac.uryukyu.ie.e195757;



public class Main {
    public static void main(String[] args) {
        String[][] Board = {
                {" ", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8"},
                {"1", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
                {"2", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
                {"3", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
                {"4", "  ", "  ", "  ", " ●", " ○", "  ", "  ", "  "},
                {"5", "  ", "  ", "  ", " ○", " ●", "  ", "  ", "  "},
                {"6", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
                {"7", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
                {"8", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
        };
        for (int s = 0; s < Board.length; s++) {
            System.out.print("\n");
            for (int i = 0; i < Board.length; i++) {
                System.out.print(Board[s][i]);
            }
        }

    }
}
