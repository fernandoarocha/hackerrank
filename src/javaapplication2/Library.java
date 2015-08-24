/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import javax.rmi.CORBA.Util;

/**
 *
 * @author fernando.rocha
 */
public class Library {
    public final static int DAY_HACKOS = 15;
    public final static int MONTH_HACKOS = 500;
    public final static int FIXED_HACKOS = 10000;
    
    public static void main(String[] args) throws ParseException {
        
        Scanner scan = new Scanner(System.in);
      
        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
        String datein="";
        String dateout="";
        int payment = 0;
        
       dateout = scan.nextLine();
       datein = scan.nextLine();
       
       Date dout = format.parse(dateout);
       Date din = format.parse(datein);
       Calendar cout = new GregorianCalendar();
       cout.setTime(dout);
       Calendar cin = new GregorianCalendar();
       cin.setTime(din);
       
        int dayin = cin.get(Calendar.DAY_OF_MONTH),
            monthin = cin.get(Calendar.MONTH),
            yearin = cin.get(Calendar.YEAR),
            dayout = cout.get(Calendar.DAY_OF_MONTH),
            monthout = cout.get(Calendar.MONTH),
            yearout = cout.get(Calendar.YEAR);
       
        if(yearout<yearin){
            payment = 0;
        } 
       if(monthin == monthout && yearin == yearout){
           int days = Math.abs(dayout - dayin);
           payment = days * DAY_HACKOS;
       }
       else if(datein == dateout || cout.compareTo(cin) < 0){
           payment = 0;
       }
       else if(yearout == yearin && monthin != monthout){
           int month = Math.abs(monthout - monthin);
           payment = month * MONTH_HACKOS;
       }else{
           payment = FIXED_HACKOS;
       }
       
       System.out.println(payment);
    }
    
}
