package large_cars_package;

import java.util.Scanner;

public class large_cars {

    public static void scorpio(){
        System.out.println();
        System.out.println("            Key specifications of Mahindra Scorpio: ");
        System.out.println();
        System.out.print("ARAI Mileage: 22.61 Kmpl");
        System.out.print("       ");
        System.out.println("Fuel type: Diesel");
        System.out.print("Seating capacity: 7,9");
        System.out.print("          ");
        System.out.println("Fuel tank caapacity: 60 Litres");
        System.out.print("Body type: SUV");
        System.out.print("                 ");
        System.out.println("Engine displacement: 2184 cc");
        System.out.println("Rating: 4.7/5");
        System.out.println();
        Scanner sc7=new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        int distance=sc7.nextInt(); 
        System.out.print("Enter the days: ");
        int day=sc7.nextInt();
        if(distance>0 && distance<=100){
            System.out.println("Rent is: "+ 900*day);
        }
        else if(distance>100 && distance<=250){
            System.out.println("Rent is: "+ 1400*day);
        }
        else if(distance>250){
            System.out.println("Rent is: "+ 2600*day);
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

    public static void carens(){
        System.out.println();
        System.out.println("            Key specifications of Kia Carens: ");
        System.out.println();
        System.out.print("ARAI Mileage: 21.0 Kmpl");
        System.out.print("        ");
        System.out.println("Fuel type: Diesel");
        System.out.print("Seating capacity: 7");
        System.out.print("            ");
        System.out.println("Fuel tank caapacity: 45 Litres");
        System.out.print("Body type: MUV");
        System.out.print("                 ");
        System.out.println("Engine displacement: 1493 cc");
        System.out.println("Rating: 4.4/5");
        System.out.println();
        Scanner sc5=new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        int distance=sc5.nextInt(); 
        System.out.print("Enter the days: ");
        int day=sc5.nextInt();
        if(distance>0 && distance<=100){
            System.out.println("Rent is: "+ 800*day);
        }
        else if(distance>100 && distance<=250){
            System.out.println("Rent is: "+ 1200*day);
        }
        else if(distance>250){
            System.out.println("Rent is: "+ 2400*day);
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

    public static void innova(){
        System.out.println();
        System.out.println("            Key specifications of Toyota Innova: ");
        System.out.println();
        System.out.print("ARAI Mileage: 12.99 Kmpl");
        System.out.print("       ");
        System.out.println("Fuel type: Diesel");
        System.out.print("Seating capacity: 7");
        System.out.print("            ");
        System.out.println("Fuel tank caapacity: 55 Litres");
        System.out.print("Body type: MUV");
        System.out.print("                 ");
        System.out.println("Engine displacement: 2494 cc");
        System.out.println("Rating: 4.5/5");
        System.out.println();
        Scanner sc6=new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        int distance=sc6.nextInt(); 
        System.out.print("Enter the days: ");
        int day=sc6.nextInt();
        if(distance>0 && distance<=100){
            System.out.println("Rent is: "+ 850*day);
        }
        else if(distance>100 && distance<=250){
            System.out.println("Rent is: "+ 1300*day);
        }
        else if(distance>250 ){
            System.out.println("Rent is: "+ 2350*day);
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
        scorpio();
        carens();
        innova();

    }
    
}
