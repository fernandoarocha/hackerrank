/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author fernando.rocha
 */
public class Staircase {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int stair = 0;
         stair = scan.nextInt();
         
         for(int i =0; i< stair; i++){
            System.out.println(String.format(String.format("%%0%dd",stair-i),1).replace("0"," ").replace("1",String.format(String.format("%%0%dd",i+1),1).replace("1","#").replace("0","#")));
         }
     }
}
