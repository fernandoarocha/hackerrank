/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author fernando.rocha
 */
public class Pangrams {
    int[] ascFounds = new int[26];
    
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String enterPangrams = "";
        int contNumbers;
        enterPangrams = scan.nextLine();
        enterPangrams = enterPangrams.toLowerCase();
        char[] charArray = enterPangrams.toCharArray();
        HashMap
        
        
        for(int i = 0; i< charArray.length; i++){
            if(Character.isLetter(enterPangrams.charAt(i))){
                int asc = (int) enterPangrams.charAt(i);
                if((asc>=97)&&(asc<=122)){
                    searchForAsc();
                }
            }
        }
        if(charArray.length == 26){
            System.out.println("pangram");
        }else{
            System.out.println("not pangram");
        }
    }
    
    
    public boolean searchForAsc(int asc){
        for(int j = 0; j< ascFounds.length; j++){
            if(ascFounds[j] == asc){
                return false;
            }
        }
        return true;
    }
}
            
