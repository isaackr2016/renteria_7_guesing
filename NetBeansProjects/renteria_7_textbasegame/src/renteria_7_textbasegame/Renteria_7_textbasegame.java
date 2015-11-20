/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renteria_7_textbasegame;

import java.util.Scanner;

/**
 *
 * @author irenteria
 */
public class Renteria_7_textbasegame {

    static String problem1;
    static String problem2;
    static String problem3;
    static boolean no = false;
    static boolean ood = false;
    static boolean end = false;
    static boolean eg = false;
    static boolean eal = false;
    static boolean egj = false;
    static boolean aelj = false;
    static boolean j = false;
    static boolean erk = false;
    static boolean ait = false;
    static boolean elo = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (end) {
            System.out.println("the end");
        }

        while (!no & !end) {
// you are the hero #hero
            System.out.println("you have woken up in a unknowwn city ");
            System.out.println("you pullout your phone and you can call your mom your frenid or look at maps .");

            Scanner choice1 = new Scanner(System.in);
            String problem1 = choice1.nextLine().toLowerCase();
            if (problem1.contains("mo")) {
                end = true;
                System.out.println("she answers and tell you she is on you way to pick you up  ");
                // ememy is a teribale story no just a joke to end the game early y would you call you mom moma's boy 
            }
            if (problem1.contains("friend")) {
                no = false;
                System.out.println("no one answers");
            }
            if (problem1.contains("ap")) {

                System.out.println("you see a location and you start walking tword it ");
                no = true;
            }

        }
//while loop 2 #while 

            while (no & !eg & !eal) {
            System.out.println("as you walk you grow hunry you can steal food , look for free food ,or beg for money ");
            Scanner choice2 = new Scanner(System.in);
            String problem2 = choice2.nextLine().toLowerCase();
            if (problem2.contains("ok")) {
                no = true;
                System.out.println("you look but where unsucsessful ");
            }
            if (problem2.contains("ste")) {
                no = false;
                eal = true;

            }
            if (problem2.contains("eg")) {
                no = false;
                eg = true;

            }
            while (eal & !j) {
                System.out.println("you where able to get away with little food and you continu on your journey");
                j = true;
            }
            while (eg & !j) {
                System.out.println("as you start asking a random stranger drops a bag of gold coins you are rich");
                System.out.println("you buy food and take a taxie to the location on your phone ");
                j = true;
            }
        }
    }
     static public void j(){
            while (!erk & !ait & !elo) {
                System.out.println("as you arive you look and see a holel you enter and you can take the elovater to a floor, give your name too the clerk, or just wait in the loby");
                Scanner choice3 = new Scanner(System.in);
                String problem3 = choice3.nextLine().toLowerCase();

                if (problem3.contains("elovater")) {
                    System.out.println("befor you get there you are aprehended by securty and escorted out ");
                    elo = true;
                }
                if (problem3.contains("clerk")) {
                    System.out.println("you give her you name and she say 'yes you room is 120 and your guess has ariver'");
                    erk = true;
                }
                if (problem3.contains("wait")) {
                    System.out.println("as you wait a mysterious women walks over and take your hand and says 'your majisty we have found you ' you go with her knowinw you arent a king  ");
                    ait = true;

                }
                while ( ait & !j ) {
                    System.out.println("she shoves you in to the car and tells you we are going to the palace. as you arive the car blows up yuo passout ");
                    System.out.println("you wake up it was all a dream you are still at the hotel. you walk out side ");
                       
                            
                }

            }
     }
     static public void end (){
         
             System.out.println("the end");
         
     }

       
       

        
    

