/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fixedpoint;

import java.util.Scanner;

/**
 *
 */
public class FixedPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String eq = " " ;
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter approximation to fixed point");
        int p = in.nextInt();
        System.out.println("Enter initial value");
        double p0 = in.nextDouble();
        fp(p,p0);
    }
    public static void fp(int P, double P0){
        double tol = 0 ;
        double[] array = new double[10000];
        array[0] = P0 ;
        for (int i = 1 ; i < 10000 ; i++){
            array[i] = 2 * (Math.pow((array[i-1]-1), 0.5));
            System.out.println(array[i]);
            }
        for (int j = 1 ; j < 10000 ; j++){
            tol = array[j-1] - array[j];
            if (tol < 0.0000001 ){
                if (tol < 0.0000000001){
                    System.out.println("It is a stagnant function");
                }
                else {
                    System.out.println("The sequence converges ");
                System.out.println("The maximum number of iterations is " + j);
                break ;
                }
        }
        }
        if (tol > 0.0000001){
            System.out.println("The sequence diverges");
        }
    }
}

