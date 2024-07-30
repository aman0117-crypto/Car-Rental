package luxury_cars_pakage;

import java.util.Scanner;

public class luxury_cars {

    public static void x1(){
        System.out.println();
        System.out.println("            Key specifications of BMW X1: ");
        System.out.println();
        System.out.print("ARAI Mileage: 20.37 Kmpl");
        System.out.print("       ");
        System.out.println("Fuel type: Diesel");
        System.out.print("Seating capacity: 5");
        System.out.print("            ");
        System.out.println("Fuel tank caapacity: 51 Litres");
        System.out.print("Body type: SUV");
        System.out.print("                 ");
        System.out.println("Engine displacement: 1195 cc");
        System.out.println("Rating: 4.6/5");
        System.out.println();
        Scanner sc7=new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        int distance=sc7.nextInt(); 
        System.out.print("Enter the days: ");
        int day=sc7.nextInt();
        if(distance>0 && distance<=100){
            System.out.println("Rent is: "+ 1200*day);
        }
        else if(distance>100 && distance<=250){
            System.out.println("Rent is: "+ 2000*day);
        }
        else if(distance>250 ){
            System.out.println("Rent is: "+ 3500*day);
        }
        System.out.println();
        System.out.println("Press 1 for Confirm the booking..");
        System.out.println();
        System.out.print("Enter the number: ");
        int book1=sc7.nextInt();
        switch(book1){
            case 1:
            System.out.println();
            System.out.println("Your Booking has been confirmed.");
            System.out.println();
            System.out.println("                  ---Thank you for using the Car Rental---");
            break;
            default:
            System.out.println("Invalid selection.");
            System.out.println();
            System.out.println("                  ---Thank you for using the Car Rental---");
            break;
        }
    }

    public static void fpace(){
        System.out.println();
        System.out.println("            Key specifications of Jaguar F-Pace: ");
        System.out.println();
        System.out.print("ARAI Mileage: 19.3 Kmpl");
        System.out.print("        ");
        System.out.println("Fuel type: Diesel");
        System.out.print("Seating capacity: 5");
        System.out.print("            ");
        System.out.println("Fuel tank caapacity: 60 Litres");
        System.out.print("Body type: SUV");
        System.out.print("                 ");
        System.out.println("Engine displacement: 1197 cc");
        System.out.println("Rating: 4.4/5");
        System.out.println();
        Scanner sc5=new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        int distance=sc5.nextInt(); 
        System.out.print("Enter the days: ");
        int day=sc5.nextInt();
        if(distance>0 && distance<=100){
            System.out.println("Rent is: "+ 1100*day);
        }
        else if(distance>100 && distance<=250){
            System.out.println("Rent is: "+ 1800*day);
        }
        else if(distance>250 ){
            System.out.println("Rent is: "+ 3000*day);
        }
        System.out.println();
        System.out.println("Press 1 for Confirm the booking..");
        System.out.println();
        System.out.print("Enter the number: ");
        int book2=sc5.nextInt();
        switch(book2){
            case 1:
            System.out.println();
            System.out.println("Your Booking has been confirmed.");
            System.out.println();
            System.out.println("                  ---Thank you for using the Car Rental---");
            break;
            default:
            System.out.println("Invalid selection.");
            System.out.println();
            System.out.println("                  ---Thank you for using the Car Rental---");
            break;
        }
        
    }

    public static void fortuner(){
        System.out.println();
        System.out.println("            Key specifications of Toyota Fortuner: ");
        System.out.println();
        System.out.print("ARAI Mileage: 8 Kmpl");
        System.out.print("           ");
        System.out.println("Fuel type: Diesel");
        System.out.print("Seating capacity: 7");
        System.out.print("            ");
        System.out.println("Fuel tank caapacity: 80 Litres");
        System.out.print("Body type: SUV");
        System.out.print("                 ");
        System.out.println("Engine displacement: 2755 cc");
        System.out.println("Rating: 4.4/5");
        System.out.println();
        Scanner sc6=new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        int distance=sc6.nextInt(); 
        System.out.print("Enter the days: ");
        int day=sc6.nextInt();
        if(distance>0 && distance<=100){
            System.out.println("Rent is: "+ 1050*day);
        }
        else if(distance>100 && distance<=250){
            System.out.println("Rent is: "+ 1750*day);
        }
        else if(distance>250 ){
            System.out.println("Rent is: "+ 2900*day);
        }
        System.out.println();
        System.out.println("Press 1 for Confirm the booking..");
        System.out.println();
        System.out.print("Enter the number: ");
        int book3=sc6.nextInt();
        switch(book3){
            case 1:
            System.out.println();
            System.out.println("Your Booking has been confirmed.");
            System.out.println();
            System.out.println("                  ---Thank you for using the Car Rental---");
            break;
            default:
            System.out.println("Invalid selection.");
            System.out.println();
            System.out.println("                  ---Thank you for using the Car Rental---");
            break;
        }
        
    }
    public static void main(String [] args){
        x1();
        fpace();
        fortuner();

    }
    
}
