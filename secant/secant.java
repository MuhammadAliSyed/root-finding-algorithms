/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secant;

/**
 *
 */
public class Secant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0 ;
        double p0 = -2.6, p1 = -2.4, p = -2, p2 = 0 ;
        while (Math.abs(p-p2) > 0.000001){
            count++ ;
            p2 = p1 - ((f(p1) *(p1-p0)) / (f(p1) - f(p0)));
            p0 = p1 ;
            p1 = p2;
            if (Math.abs(p-p2) < 0.000001){
                System.out.println("The root of the equation is " + p);
                System.out.println("The numner of iterations required = " + count);
            }
        }
        
    }
    public static double f(double a){
        return Math.pow(a,3) - (3 * a) + 2 ;
    }
}
