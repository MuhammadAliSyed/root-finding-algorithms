/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bijection;

/**
 *
 */
public class Bijection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(f(1.1142));
        double m = 0 ;
         boolean found = false ;
        double a = 0 ; double b = 2 ;
        while (found != true){
            m = (a + b) / 2 ;
            //System.out.println(f(m));
            if (f(a) == 0|| Math.abs(f(a) - 0)  < 0.0000001){
                System.out.println("The root of the equation is " + a);
                found = true ;
                break ;
            }
            if (f(b) == 0 ||Math.abs((f(b) - 0)) < 0.0000001){
                System.out.println("The root of the equation is " + b);
                found = true ;
                break;
            } 
            if (f(m) == 0 ||Math.abs((f(m) - 0)) < 0.0000001) {
            System.out.println("The root of the equation is " + m);
            found = true ;
            break;
            }
            if (f(m) > 0){
            b = m ;
            }
            else {
                a = m ;
            }
        }
    }
    public static double f(double a){
        return (a * Math.sin(a)) - 1 ;
    }

    
    
}

