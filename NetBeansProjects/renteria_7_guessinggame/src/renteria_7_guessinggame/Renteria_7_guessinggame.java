/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renteria_7_guessinggame;
import java.util.Scanner;
/**
 *
 * @author irenteria
 */
public class Renteria_7_guessinggame {
static int thenum = 9;
static int usernum;
static String username;
static boolean tryagain=true ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
       
    Scanner name=new Scanner (System.in);
        // TODO code application logic here
   
    System.out.println(" Wecome would you like to play a game? ");
    System.out.println(" Your name?");
    String username = name.nextLine();
    System.out.println("Welcome " + username );
    
    }
     
    static void tryagain(){  
    while(tryagain){
          
     }    
        Scanner luckynum=new Scanner (System.in);
        System.out.println("guess a number ");
    int usernum = luckynum.nextInt();
    System.out.println("your number is " + usernum);
    if (usernum == thenum){
        System.out.println("winner");
        tryagain=false; 
    }
    if (usernum != thenum ){
        System.out.println ("WRONG!! try again ");
        tryagain=true;
    }
    if (usernum > thenum){
        System.out.println("to high");
        
    } 
    if (usernum < thenum){
        System.out.println("to low ");
    }
    }
}

