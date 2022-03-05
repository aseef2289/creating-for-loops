/*
* File Name: Main.java
* Author: Aseef Ali Hasan
* Date: August 12, 2021
* Description:
* This is a program completes different counting scenarios
* It takes user input 
* It is text based
* Uses for loops
*/

//needed to get user input via keyboard
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Scanner is called keyedInput and initliazed once
    Scanner keyedInput = new Scanner(System.in);

    //integer for choice starts at zero
    //used to store user's choice
    int choice = 0;
    
    //Prints options for user
    System.out.println("---Cool Counting Program---");
    System.out.println("");

    System.out.println("Please enter your choice:");
    System.out.println("1... Count from 0 to 10 by 1");
    System.out.println("2... Count from 100 to 0 by 10");
    System.out.println("3... Count from 50 to 500 by 50");
    System.out.println("4... Count from 6000 to 1000 by 1000");
    System.out.println("Please enter your choice:");

    //stores user choice as an integer
    choice = keyedInput.nextInt();

    //Makes some space between text blocks
    System.out.println("");
    System.out.println("----------------------------");

    //Actions if user picks 1
    if (choice == 1)
    {  
      //Prints what counting scenario user chose
      System.out.println("You have chosen to count from 0 to 10 by 1");
      /*
      * i starts at 0
      * will continue to add one each time
      * until i is less than or equal to 10
      * prints values each time
      */
      for (int i = 0; i <= 10; i++)
      {
        System.out.println(i);
      }
    }
    //Actions if user picks 2
    else if (choice == 2)
    {
      //Prints what counting scenario user chose
      System.out.println("You have chosen to count from 100 to 0 by 10");
      /*
      * i starts at 100
      * will continue to subtract 10 each time
      * until i is greater than or equal to 0
      * prints values each time
      */
      for (int i = 100; i >= 0; i = i - 10)
      {
        System.out.println(i);
      }
    }
    //Actions if user picks 3
    else if (choice == 3)
    {
      //Prints what counting scenario user chose
      System.out.println("You have chosen to count from 50 to 500 by 50");
      /*
      * i starts at 50
      * will continue to add 50 each time
      * until i is less than or equal to 500
      * prints values each time
      */
      for (int i = 50; i <= 500; i = i + 50)
      {
        System.out.println(i);
      }
    }
    //Actions if user picks 4
    else if (choice == 4)
    {
      //Prints what scenario user chose
      System.out.println("You have chosen to count from 6000 to 1000 by 1000");
      /*
      * i starts at 6000
      * will continue to subtract 1000 each time
      * until i is greater than or equal to 1000
      * prints values each time
      */
      for (int i = 6000; i >= 1000; i = i - 1000)
      {
        System.out.println(i);
      }
    }
    //Actions if user picks something else
    else
    {
      //Asks user to pick a valid response next time
      System.out.println("Please enter a valid response next time:");
      //Shows user valid responses
      System.out.println("1, 2, 3 or 4");
    }
    keyedInput.close();
  }//end of main method
}//end of class method