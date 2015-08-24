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
public class LongSumArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numberOfLines;
        numberOfLines = scan.nextInt(); 
        double elements = 0;
        double insertNumber;
        for(int i = 0; i<numberOfLines; i++){
            insertNumber = scan.nextInt();
            elements += insertNumber;
        } 
        System.out.println(elements);
     }
}
