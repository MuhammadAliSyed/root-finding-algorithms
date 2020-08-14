/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falseposition;

/**
 *
 */
public class FalsePosition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x1 = 0,x2 = 2,m = 0 ;
        double Xi = 0 ;
        boolean found = false ;
        double root = 0 ;
        while ((f(x1) * f(x2)) < 0){
            m = f(x2) - f(x1) / (x2-x1);
            double c = f(x1) - (m * x1);
           Xi  = Equation(m,c);
           root = f(Xi);
           if (root < 0){
               x1 = Xi ; 
           }
           else if (root > 0) {
               x2 = Xi ;
           }
           if (Math.abs((root - 0)) < 0.0000001){
               System.out.println("The root of the equation is " + Xi);
               found = true;
               break ;
               
           }
        }
    }
    public static double f(double a){
        return (a * Math.sin(a)) - 1 ;
    }
    public static double Equation (double m,double c){
        double x , y = 0 ;
        x = (y - c) / m ;
        return x;
    }
    
}

