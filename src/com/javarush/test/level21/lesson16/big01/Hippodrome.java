package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by Andriana_Yarmoliuk on 6/30/2016.
 */
public class Hippodrome
{
    static public ArrayList<Horse> horses = new ArrayList<>();

    public static Hippodrome game;

    public ArrayList<Horse> getHorses(){
        return horses;
    }

    public void run() throws InterruptedException
    {
        for (int i = 0; i < 100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move(){
        for (Horse h: horses)
        {
            h.move();
        }
    }

    public void print(){
        for (Horse h: horses)
        {
            h.print();
        }

    }

    public static void main(String[] args) throws InterruptedException
    {
        game = new Hippodrome();
        game.horses.add(new Horse("horse1", 3, 0));
        game.horses.add(new Horse("horse2", 3, 0));
        game.horses.add(new Horse("horse3", 3, 0));


        game.run();
        game.printWinner();

    }

    public Horse getWinner(){

        double maxDist = 0;
        Horse winner = new Horse("", 0, 0);
        for (Horse h: horses)
        {
            if(h.getDistance() > maxDist){
                maxDist = h.getDistance();
                winner = h;
            }
        }

        return winner;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

}
