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
public class TimeConversion {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String time = line.replaceAll("[\\D]", "");
        boolean isAM = true;
        if(line.indexOf("PM") > 0)isAM = false;
        if(isAM){
            line = line.replaceFirst("12", "00");
            System.out.println(line.replace("AM", ""));
        }
        else {
            double number = Integer.parseInt(time) / 10000.0;
            for(int k = 0; k < 12; k++){
                number++;
                if(number > 23.9999){
                    int rs = (int)number;
                    number = number-rs;
                }
            }
            line = line.replace("PM", "");
            line = line.replace("AM", "");
            int rs = (int)number;
            String convert = String.valueOf(rs);
            String sub = line.substring(0,2);
            if(rs == 0){
                System.out.println(line);
            }
            else System.out.println(line.replaceFirst(sub, convert));
        }
    }
}
