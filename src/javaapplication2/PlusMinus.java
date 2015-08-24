/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author fernando.rocha
 */
public class PlusMinus {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int quantity = 0;
         int numbers = 0;
         double fractionpos = 0;
         double fractionzero = 0;
         double fractionneg = 0;
         int pos=0,neg=0,zero=0;
         System.out.println("entre com a quantidade:");
         quantity = scan.nextInt();
         
         for(int i = 0; i<quantity; i++){
             System.out.println("entre com o numero:");
             numbers = scan.nextInt();
             
             if(numbers < 0){
                 neg++;
             }
             else if(numbers == 0){
                 zero++;
             }else{
                 pos++;
             }
         }
         fractionpos = (float)pos/quantity;
         fractionneg = (float)neg/quantity;
         fractionzero = (float) zero/quantity;
         
         System.out.printf("%.5f\n", fractionpos);
         System.out.printf("%.5f\n", fractionneg);
         System.out.printf("%.5f\n", fractionzero);
     }
}
