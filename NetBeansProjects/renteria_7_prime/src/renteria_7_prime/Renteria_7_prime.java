/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renteria_7_prime;

/**
 *
 * @author irenteria
 */
public class Renteria_7_prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int counter = 0;
              
        // TODO code application logic her
       //what happens in loop will happen again AND AGIAN until it exits 
        for (int i = 0;i<100; i++) 
            {
            if (isOdd(i)){
            // counter++;
                System.out.println(i + " is odd ");
              
               // a method is like a little program or function it is the action you want to repeat frequently  
            }
            if (isEven(i)){
                System.out.println(i + " is even");
            }
            }
      //  System.out.println(" we have " + counter + " evens");
    }
              static boolean isEven (int number){
        return (number % 2 ==0);
         
              }
              static boolean isOdd(int anumber){
                  return (anumber % 2 != 0);
              }
              static boolean isprime (int thenumber){
                  int divsior =0;
              for (int i = 2; i< thenumber; i++ ) {
                  if (thenumber % i == 0)   {
                      divsior +=1;
                      
                  }
                 
              }
               return (divsior == 0); 
               System.out.println(divsior) ;
              }
}
         
    
    

