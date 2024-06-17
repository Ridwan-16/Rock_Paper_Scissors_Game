package com.company;
import java.util.Random;
import java.util.Scanner;
public class Rock_Paper_Scissors_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("Enter your stake:");
        int stake = sc.nextInt();
        int com = rn.nextInt(1,3);
        System.out.println("opponent stake: \n" + com);

//        1=Rock
//        2=Paper
//        3=Scissors

        if (stake==com) {
            System.out.println("draw!!");
        }else if ((stake == 1 && com == 2)||(stake == 2 && com == 3)||(stake == 3 && com == 1)) {
            System.out.println("you lose :(");
        }else if ((stake == 1 && com == 3)||(stake == 2 && com == 1)||(stake == 3 && com == 2)) {
            System.out.println("you win!!");
        }else{
            System.out.println("wrong stake!!!!!\nyou should take between 1 to 3");
        }

    }
}
