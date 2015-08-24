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
public class GrownTree {
    private static int GrowthCalculator(int n){
        int growth = 0;
        if(n == 0)
            return 1;
        else if (n % 2 == 1)
            growth = growth + (2 * GrowthCalculator(n - 1));
        else
            growth = growth + (1 + GrowthCalculator(n - 1));
        return growth;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTrees = Integer.parseInt(in.nextLine());
        int [] lifeCycles = new int [numberOfTrees];
        for (int i = 0; i < numberOfTrees; i++){
           lifeCycles[i] = Integer.parseInt(in.nextLine());
           System.out.println(GrowthCalculator(lifeCycles[i]));
        }
    }
}
