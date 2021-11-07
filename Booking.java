/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carresv;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author abhis
 */
public class Booking {
    Scanner input = new Scanner(System.in);
    
    String name;
    int carNoNeed;
    Date date;
    
    Booking(){
        System.out.println("Enter the name");
        name = input.next();
        System.out.println("Enter the car number needed");
        carNoNeed = input.nextInt();
        System.out.println("Enter the date as dd/MM/yyyy");
        String datestr = input.next();
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = dateformat.parse(datestr);
        } catch (ParseException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
