/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author fernandorocha
 */
public class DividDigits {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantity;
        String numbers;
        int[] numberArray = {};
        int number = 0;
        int cont;
        quantity = scan.nextInt();
        for(int i = 0; i< quantity; i++){
            numbers = scan.nextLine();
            cont = 0;
            for(int j = 0; j< numbers.length(); j++){
                number = (int)numbers.charAt(j);
                if(Integer.parseInt(numbers) % number == 0){
                    cont++;
                }
            }
            System.out.println(cont);
        }
        
        
    }
    
}
