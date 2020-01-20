package jp.ac.uryukyu.ie.e195757;

public class Board {
    private String[][] board = {

            {"　","ａ","ｂ","ｃ","ｄ","ｅ","ｆ","ｇ","ｈ","　"},
            {"１","・","・","・","・","・","・","・","・","　"},
            {"２","・","・","・","・","・","・","・","・","　"},
            {"３","・","・","・","・","・","・","・","・","　"},
            {"４","・","・","・","⚫️","⚪","・","・","・","　"},
            {"５","・","・","・","⚪","⚫️","・","・","・","　"},
            {"６","・","・","・","・","・","・","・","・","　"},
            {"７","・","・","・","・","・","・","・","・","　"},
            {"８","・","・","・","・","・","・","・","・","　"},
            {"　","　","　","　","　","　","　","　","　","　"}
    };
    public int getLength(){
        return board.length;
    }
    public String[][] getBoard(){
        return board;
    }
    public void printBoard(){
        for (int s = 0; s < board.length; s++){
            System.out.println();
            for(int i = 0; i < board.length; i++){
                System.out.print(board[s][i]);
            }
        }
    }
    public void put(int x, int y){
        String[][] board = getBoard();
        board[x][y] = "⚫️";
    }
}
