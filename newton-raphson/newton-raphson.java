/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonraphson;

/**
 *
 */
public class NewtonRaphson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x0 = 2 ; double tol = 0;
        double a = 0 ; double b = 0; double root = 0;
        while (Math.abs(f(a)- 0) > 0.000001){
            root = a - (f(a))/(d(a));
            a = root;
        }
        System.out.println(root);
    }
    public static  double f(double i){
        return (Math.pow(i,3) - (2*i) - 5); // x^3 - 2x -5
    }
    public static double d(double i){
        return ((3 * Math.pow(i,2)) - 2); // 3x^2 - 2
    }
}
