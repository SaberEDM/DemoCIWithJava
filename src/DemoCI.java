/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democi;

import java.util.Scanner;

/**
 *
 * @author King Arthur
 */
public class DemoCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***** Demo CI With Java *****");
        System.out.println("***** Compare Two Number *****");
        System.out.println("");
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        int number1;
        System.out.println("Input The First Number: ");
        number1 = Integer.parseInt(sc.nextLine());

        int number2;
        System.out.println("Input The Second Number: ");
        number2 = Integer.parseInt(sc.nextLine());

        if (number1 > number2) {
            System.out.println("The First Number Is Bigger Than The Second Number!");
        } else {
            System.out.println("The Second Number Is Bigger Than The First Number!");
        }
    }

}
