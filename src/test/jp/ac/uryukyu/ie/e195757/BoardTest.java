package jp.ac.uryukyu.ie.e195757;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    int turn = 0;

    int getTurn() {
        turn++;
        return turn;
    }

    @Test
    void end(){
        while (true){
            if (getTurn() != 9) {
                System.out.println("まだ終わらない");
            }else{
                System.out.println("終わり");
                System.exit(0);
            }

        }
    }
}