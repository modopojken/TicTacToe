package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.Random;

public class tictactoe{

    public static char board[][] = new char[3][3];
    public static int counter = 1;
    public static String firstMove;
    public static boolean end = false;


    public static void main(String[] args) {

    for(int i = 0; i < 3; i++){

        for(int j = 0; j < 3; j++){

            board[i][j] = '-';

        }

    }

    /*
    ---
    ---
    ---
     */

    String first = JOptionPane.showInputDialog(null, "Who goes first? Human(enter H) Computer(enter C)");

    if(first.equals("C")){
        System.out.println("Computer goes first");
        move();
        while(!end){

            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

        }

    }
    else if(first.equals("H"))
        {
            System.out.println("Human goes first");
        }
        else{
            System.out.println("Not a valid input");
        }
    }

    public static void move(){

        Random rand = new Random();
        int f = rand.nextInt(4) + 1;
        if(counter == 1)
        {
            if(f == 1){
                board[0][0]='X';
                firstMove = "00";
            }
            else if(f == 2){
                board[0][2]='X';
                firstMove = "02";
            }
            else if(f == 3){
                board[2][0]='X';
                firstMove = "20";
            }
            else if(f == 4){
                board[2][2]='X';
                firstMove = "22";
            }
            else{
                board[2][2]='X';
                firstMove = "22";
            }
        }
        counter++;
    }

}

