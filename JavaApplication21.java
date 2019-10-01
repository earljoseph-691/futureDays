
package javaapplication21;

import java.util.Scanner;


public class JavaApplication21 {

   
    public static void main(String[] args) {
      String Today; 
      String futureday;
         
        Scanner input = new Scanner(System.in);
         
        System.out.print("Enter today's day: ");
 int Day = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
 int Number_Days = input.nextInt();
         
        switch (Day) {
            case 0:
                Today = "Sunday";
                break;
            case 1:
                Today = "Monday";
                break;
            case 2:
                Today = "Tuesday";
                break;
            case 3:
                Today = "Wednesday";
                break;
            case 4:
                Today = "Thursday";
                break;
            case 5:
                Today = "Friday";
                break;
            default:
                Today = "Saturday";
                break;
        }
         
        int Futureday = (Day + Number_Days) % 7;
         
        switch (Futureday) {
            case 0:
                futureday = "Sunday";
                break;
            case 1:
                futureday = "Monday";
                break;
            case 2:
                futureday = "Tuesday";
                break;
            case 3:
                futureday = "Wednesday";
                break;
            case 4:
                futureday = "Thursday";
                break;
            case 5:
                futureday = "Friday";
                break;
            default:
                futureday = "Saturday";
                break;
        }
         
        System.out.println("Today is " + Today + " and the future day is " + 
                futureday);
  
    }
    
}
