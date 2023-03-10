package com.Manju.sandl;

import java.util.Scanner;

public class SnakeLadderApplication{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("BOARD SIZE:");
        int bs=sc.nextInt();
        System.out.println("NO.OF PLAYERS:");
        int playersno=sc.nextInt();
        System.out.println("NO.OF SNAKES:");
        int snakesno=sc.nextInt();
        System.out.println("NO.OF LADDERS:");
        int laddersno=sc.nextInt();

        Game game=new Game(laddersno,snakesno,bs);
        for(int i=0;i<playersno;i++){
            System.out.println("Player Name "+i);
            String pname=sc.next();
            Player player=new Player(pname);
            game.addPlayer(player);
        }
        game.playGame();
    }
}
