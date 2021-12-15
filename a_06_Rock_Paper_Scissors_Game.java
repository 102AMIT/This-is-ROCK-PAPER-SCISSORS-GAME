package com.company;
import java.util.Random;
import java.util.Scanner;
public class a_06_Rock_Paper_Scissors_Game {
    public static void main(String[] args) {
        System.out.println("                    **** WELCOME TO THE GAME ****");
        System.out.println("                    This is ROCK PAPER SCISSORS");
        System.out.println("                    <<<<<<<<Rules of game>>>>>>>>");
        System.out.println("                    Select ROCK=Press-------->(0)");
        System.out.println("                    Select PAPER=Press------->(1)");
        System.out.println("                    Select SCISSORS=Press---->(2)");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int userInput= sc.nextInt();
        Random random=new Random();
        int computerInput= random.nextInt( 3);
        

        if(userInput==computerInput)
        {
            System.out.println("Draw");
        }
        else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1)
        {
            System.out.println("Congratulation! You Win");
        }
        else
        {
            System.out.println("Sorry! Computer Win");
        }
        if(computerInput==0)
        {
            System.out.println("Computer Choise ROCK");
        }
        else if(computerInput==1)
        {
            System.out.println("Computer Input PAPER");
        }
        else if(computerInput==2)
        {
            System.out.println("Computer Input SCISSORS");
        }

        }
}
