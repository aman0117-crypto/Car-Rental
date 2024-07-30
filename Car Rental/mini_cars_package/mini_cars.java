package mini_cars_package;
import java.util.Scanner;


public class mini_cars {

    
    public static void alto800(){
        System.out.println();
        System.out.println("            Key specifications of Maruti Suzuki Alto 800: ");
        System.out.println();
        System.out.print("ARAI Mileage: 31.59 Km/Kg");
        System.out.print("       ");
        System.out.println("Fuel type: CNG");
        System.out.print("Seating capacity: 4");
        System.out.print("             ");
        System.out.println("Fuel tank caapacity: 60 Litres");
        System.out.print("Body type: Hatchback");
        System.out.print("            ");
        System.out.println("Engine displacement: 796 cc");
        System.out.println("Rating: 4.2/5");
        System.out.println();
        Scanner sc7=new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        int distance=sc7.nextInt(); 
        System.out.print("Enter the days: ");
        int day=sc7.nextInt();
        if(distance>0 && distance<=100){
            System.out.println("Rent is: "+ 500*day);
        }
        else if(distance>100 && distance<=250){
            System.out.println("Rent is: "+ 1200*day);
        }
        else if(distance>250 ){
            System.out.println("Rent is: "+ 2100*day);
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

    public static void wagonR(){
        System.out.println();
        System.out.println("            Key specifications of Maruti Suzuki Wagon R: ");
        System.out.println();
        System.out.print("ARAI Mileage: 24.43 Kmpl");
        System.out.print("        ");
        System.out.println("Fuel type: Petrol");
        System.out.print("Seating capacity: 5");
        System.out.print("             ");
        System.out.println("Fuel tank caapacity: 32 Litres");
        System.out.print("Body type: Hatchback");
        System.out.print("            ");
        System.out.println("Engine displacement: 1197 cc");
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
            System.out.println("Rent is: "+ 1500*day);
        }
        else if(distance>250 ){
            System.out.println("Rent is: "+ 2500*day);
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

    public static void kwid(){
        System.out.println();
        System.out.println("            Key specifications of Renault Kwid: ");
        System.out.println();
        System.out.print("ARAI Mileage: 22.3 Kmpl");
        System.out.print("         ");
        System.out.println("Fuel type: petrol");
        System.out.print("Seating capacity: 4");
        System.out.print("             ");
        System.out.println("Fuel tank caapacity: 28 Litres");
        System.out.print("Body type: Hatchback");
        System.out.print("            ");
        System.out.println("Engine displacement: 999 cc");
        System.out.println("Rating: 4.3/5");
        System.out.println();
        Scanner sc6=new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        int distance=sc6.nextInt(); 
        System.out.print("Enter the days: ");
        int day=sc6.nextInt();
        if(distance>0 && distance<=100){
            System.out.println("Rent is: "+ 700*day);
        }
        else if(distance>100 && distance<=250){
            System.out.println("Rent is: "+ 1400*day);
        }
        else if(distance>250 ){
            System.out.println("Rent is: "+ 2300*day);
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

    public static void main(String [] args)
    {
        
        alto800();
        wagonR();
        kwid();

    }
    
}
