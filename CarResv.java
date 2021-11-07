/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carresv;
import java.util.*;
/**
 *
 * @author abhis
 */
public class CarResv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        ArrayList<CarData> cars = new ArrayList<CarData>();
        cars.add(new CarData(1,true,1));
        cars.add(new CarData(2,false,2));
        cars.add(new CarData(3,true,4));
   
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to BookMyCar");
        String choice = "Yes";
        
        while(choice.toLowerCase().equals("yes")){
          System.out.println("Enter Yes to start booking or No to exit");
          choice = input.next();
          
          if(choice.toLowerCase().equals("yes")) {
              Booking bk = new Booking();
              if(isAvailable(bookings,cars,bk)){
                  System.out.println("Successfully booked");
                  bookings.add(bk);
                  System.out.println(bk.name);
              }
              else System.out.println("Sorry Booking was unsuccessful try with other carNo or date");
          }
        }
    }
    
    public static boolean isAvailable(ArrayList<Booking> bookings,ArrayList<CarData> cars,Booking bk){
            int cap = 0;
            for(CarData car : cars){
                if(car.carNo == bk.carNoNeed){
                    cap = car.capacity;
                    System.out.println("Cap = "+cap);
                    break;
                }
            }
            
            for(Booking bookditr : bookings){
                if(bookditr.carNoNeed == bk.carNoNeed && bookditr.date == bk.date){ 
                    cap--;
                    System.out.println("remaincap = "+cap);
                 }
            }
            
            return cap>0;
    }
    
}
