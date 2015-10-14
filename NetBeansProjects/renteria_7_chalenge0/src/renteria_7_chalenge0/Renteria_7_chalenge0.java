/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renteria_7_chalenge0;

/**
 *
 * @author irenteria
 */
public class Renteria_7_chalenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i<550; i++){
        if (mockingbird(i)& truegrit(i)& shootist(i)){
            System.out.println("john wayne");
                                }    
            if (mockingbird(i)& shootist(i)){
                System.out.println("the alamo");
                          }
            if (shootist(i)& truegrit(i)) {
                System.out.println("classic movies");
            }
            
        if(eldorodo(i)& truegrit(i) ) {
            System.out.println("true grit");
        } 
        if (eldorodo(i)& shootist(i)){
           System.out.println("the shootist"); 
        }  
        if (eldorodo(i)& mockingbird(i)){
            System.out.println("to kill a mockingbird");
        }
        
    }
        
        // TODO code application logic here
    }
    static boolean eldorodo(int movie){
        return (movie % 11 == 0);
    }
     static boolean truegrit (int grit ){
         return (grit % 2 == 0);
     }
     static boolean shootist (int book){
     return (book % 3 ==0);    
     }
     static boolean mockingbird (int tokilla){
    return (tokilla % 5 == 0);
     }

    private static boolean grit(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static boolean eles(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
