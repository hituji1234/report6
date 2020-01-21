package jp.ac.uryukyu.ie.e195757;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Board board = new Board();
        board.printBoard();

        Scanner scanner = new Scanner(System. in);
        //入力された内容をインスタンスから取得
        while(true) {
            board.place1();
            board.printBoard();
            board.place2();
            board.printBoard();
        }
    }
}
