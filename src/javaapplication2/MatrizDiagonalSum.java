/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author fernando.rocha
 */
public class MatrizDiagonalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int colums = 0;
        colums = scan.nextInt();
        int diagonalSum;
        int values;
        int difference;        
        int[][] matrix = new int[colums][colums];
        int diagonalOne =0;
        int diagonalTwo=0;
        
        for(int row = 0; row<colums;row++){
            for(int colum = 0; colum <colums; colum++){
                values = scan.nextInt();
                matrix[row][colum] = values;
                if(row == colum){
                    diagonalOne += matrix[row][colum];
                }
                if(colums-1-row == colum){
                    diagonalTwo += matrix[row][colum];
                }
            }
        }
        System.out.println(java.lang.Math.abs(diagonalOne - diagonalTwo));
    }
}
