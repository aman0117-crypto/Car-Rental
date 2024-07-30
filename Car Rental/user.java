import mini_cars_package.mini_cars;
import java.util.Scanner;
import large_cars_package.large_cars;
import luxury_cars_pakage.luxury_cars;
import medium_cars_package.medium_cars;
public class user {
    public static void main(String[] args) {
        long aa=0;
        long mob=0;
        System.out.println("                           ---------WELCOME TO CAR RENTAL---------");
        System.out.println();
        System.out.println("            User Registration:");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String fname = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lname = sc.nextLine();
        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        for(int i=1;i<=1;i++)
        {
            if(age<18)
            {
                System.out.println("Sorry, you are not eligible to register");
                System.out.println();
                System.out.println("                  ---Thank you for using the Car Rental---");
                break;
            }
            else
            {
                System.out.print("Enter your Aadhar number: ");
                long aadhar = sc.nextLong();
                aa=aadhar;
                long aa2=aa;
                int count1=0;
                while(aa!=0){
                    long rem1=aa%10;
                    count1++;
                    aa=aa/10;
                }
                if(count1<12 || count1>12)
                {
                    System.out.println("Invalid Aadhar Number, Please enter valid Aadhar number.");
                    System.out.println();
                    System.out.println("                  ---Thank you for using the Car Rental---");
                    break;
                }
                else
                {
                    System.out.print("Enter your Mobile number: ");
                    long mobile = sc.nextLong();
                    mob=mobile;
                    long mob1=mob;
                    int count2=0;
                    while(mob!=0)
                    {
                    long rem2=mob%10;
                    count2++;
                    mob=mob/10;
                    } 
                 if(count2<10 || count2>10)
                 {
                    System.out.println("Invalid Mobile Number, Please enter valid number.");
                    System.out.println();
                    System.out.println("                  ---Thank you for using the Car Rental---");
                    break;
                 }
                 else
                 {
                    System.out.println();
                    System.out.println("                         Entered details are:");
                    System.out.println("Name: "+fname+" "+lname);
                    System.out.println("Email: "+email);
                    System.out.println("Age: "+age);
                    System.out.println("Aadhar Number: "+aa2);
                    System.out.println("Mobile Number: "+mob1);
                    System.out.println();
                    System.out.println("Press 1 for Confirm...");
                    System.out.println("Press 2 for Cancel...");

                }
                }
            }
        
            System.out.println();
            System.out.println("Enter the number:");
            int a=sc.nextInt();
            switch(a){
                case 1:
                Scanner sc1=new Scanner(System.in);
                System.out.println();
                System.out.println("Your details has been recorded.");
                System.out.println();
                System.out.println("                           ---Plan your Ride---");
                System.out.print("Enter your current location: ");
                String r=sc1.nextLine();
                System.out.print("Enter your Destination: ");
                String str2=sc1.nextLine(); 
                System.out.println();
                System.out.println("                           --Choose a Trip--");
                System.out.println();
                System.out.println("Press 1 for Mini cars..");
                System.out.println("Press 2 for Medium cars(5 seater SUVs)..");
                System.out.println("Press 3 for large cars(7 seater SUVs)..");
                System.out.println("Press 4 for luxury cars..");
                System.out.println();
                System.out.print("Enter the number: ");
                int i1=sc1.nextInt();
                switch(i1)
                {
                    case 1:
                    System.out.println();
                    System.out.println("Select the Car...");
                    System.out.println("Enter 1 for Maruti Suzuki ALTO 800");
                    System.out.println("Enter 2 for Maruti Suzuki Wagon R");
                    System.out.println("Enter 3 for Renault Kwid");
                    System.out.println();
                    System.out.print("Enter the number: ");
                    int i2=sc1.nextInt();
                    switch(i2){
                        case 1:
                        mini_cars.alto800();
                        break;
                        case 2:
                        mini_cars.wagonR();
                        break;
                        case 3:
                        mini_cars.kwid();
                        break;
                        default:
                        System.out.println("Invalid selection.");
                        break;
                    }
                    break;


                    case 2:
                    System.out.println();
                    System.out.println("Select the Car...");
                    System.out.println("Enter 1 for Maruti Suzuki Swift Dzire");
                    System.out.println("Enter 2 for Tata Punch");
                    System.out.println("Enter 3 for Hyundai Creta");
                    System.out.println();
                    System.out.print("Enter the number: ");
                    int i3=sc1.nextInt();
                    switch(i3){
                        case 1:
                        medium_cars.swift_dzire();
                        break;
                        case 2:
                        medium_cars.punch();
                        break;
                        case 3:
                        medium_cars.creta();
                        break;
                        default:
                        System.out.println("Invalid selection.");
                        break;
                    }
                    break;


                    case 3:
                    System.out.println();
                    System.out.println("Select the Car...");
                    System.out.println("Enter 1 for Mahindra Scorpio");
                    System.out.println("Enter 2 for Kia Carens");
                    System.out.println("Enter 3 for Toyota Innova");
                    System.out.println();
                    System.out.print("Enter the number: ");
                    int i4=sc1.nextInt();
                    switch(i4){
                        case 1:
                        large_cars.scorpio();
                        break;
                        case 2:
                        large_cars.carens();
                        break;
                        case 3:
                        large_cars.innova();
                        break;
                        default:
                        System.out.println("Invalid selection.");
                        break;
                    }
                    break;


                    case 4:
                    System.out.println();
                    System.out.println("Select the Car...");
                    System.out.println("Enter 1 for BMW X1");
                    System.out.println("Enter 2 for Jaguar F-Pace");
                    System.out.println("Enter 3 for Toyota Fortuner");
                    System.out.println();
                    System.out.print("Enter the number: ");
                    int i5=sc1.nextInt();
                    switch(i5){
                        case 1:
                        luxury_cars.x1();
                        break;
                        case 2:
                        luxury_cars.fpace();
                        break;
                        case 3:
                        luxury_cars.fortuner();
                        break;
                        default:
                        System.out.println("Invalid selection.");
                        break;
                    }
                    break;


                    default:
                    System.out.println("Invalid selection, Pls try again...");
                    System.out.println("                  ---Thank you for using the Car Rental---");
                    break;
                }
                break;


                default:
                System.out.println();
                System.out.println("           Are you sure you want to cancel?");
                System.out.println();
                System.out.println("Press 1 for Yes");
                System.out.println();
                System.out.println("Enter the Number");
                int c=sc.nextInt();
                System.out.println();
                System.out.println("                  ---Thank you for using the Car Rental---");
                break;

            }
        } 

        
    }

}
    

