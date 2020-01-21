package jp.ac.uryukyu.ie.e195757;

import java.util.Scanner;

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

    public void printBoard(){
        for (int s = 0; s < board.length; s++){
            System.out.println();
            for(int i = 0; i < board.length; i++){
                System.out.print(board[s][i]);
            }
        }
        System.out.println("\n_____________________");
    }
    public String[][] getBoard(){
        return board;
    }
    public String getStone(int x, int y){return board[x][y];}

    public void put1(int x, int y){
        String[][] board = getBoard();
        String R = getStone(x, y);
        if(R == "⚫️" ||R == "⚪️"){
            System.out.println("そこには置けないよ");
        }else board[x][y] = "⚪️";
    }
    public void place1(){
        System.out.println("⚪️のターンだよ");
        Scanner scanner = new Scanner(System. in);
        System.out.println("何行目？");
        int line = scanner.nextInt();
        System.out.println("何列目?");
        int row = scanner.nextInt();
        //入力された内容を画面に表示
        put1(line,row);
        judge(line,row);
    }
    public void put2(int x, int y){
        String[][] board = getBoard();
        String R = getStone(x, y);
        if(R == "⚫️"|| R == "⚪️"){
            System.out.println("そこにはおけないよ");
            place2();
        }else board[x][y] = "⚫️";
    }
    public void place2(){
        System.out.println("⚫️のターンだよ");
        Scanner scanner = new Scanner(System. in);
        System.out.println("何行目？");
        int line = scanner.nextInt();
        System.out.println("何列目?");
        int row = scanner.nextInt();
        //入力された内容を画面に表示
        put2(line,row);
        judge(line,row);
    }
    public void judge(int x, int y){
        String target = getStone(x, y);
        //たての処理
        if(target == board[x + 1][y]){
            if(target == board[x - 1][y] || target == board[x + 1][y]){
                System.out.println("君の勝ち");;
            }
        }

    }
}

