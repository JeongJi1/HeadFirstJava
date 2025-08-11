package org.chapter1.example;

public class PoolPuzzleOne {
    public static void main(String args[]) {
        //연습문제
    int x = 0;

    while(x < 4){
        System.out.print("a");
        if(x < 1){
            System.out.print(" ");
        }
        System.out.print("n"); // 여기까지는 고정인 거 같은데,,
        if(x > 1){
            System.out.print(" oyster");
            x = x + 2;
        }
        if(x == 1){
            System.out.print("noys ");
        }
        if(x < 1){
            System.out.print("oise ");
        }
        System.out.println();

        x = x + 1;
    }
    }
}
