package Repl_it;

import java.util.Scanner;

public class repl_it_24_PatientInformation {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                System.out.println("Welcome to the patient portal!");
                System.out.println("Please enter your personal information");

                System.out.println("Enter your first name");
                String name = scan.next();

                System.out.println("Enter your last name");
                String surname = scan.next();

                scan.nextLine();

                System.out.println("Enter your email");
                String email = scan.nextLine();

                System.out.println("Enter you street");
                String street = scan.nextLine();

                System.out.println("Enter your city");
                String city = scan.next();

                System.out.println("Enter your state");
                String state = scan.next();

                System.out.println("Enter your zip code");
                int zip_code = scan.nextInt();

                System.out.println("Enter your work phone number");
                int work_number = scan.nextInt();

                System.out.println("Enter your personal number");
                int personal_number = scan.nextInt();

                System.out.println("Enter your age");
                byte age = scan.nextByte();

                System.out.println("Enter you height");
                double height = scan.nextDouble();

                System.out.println("Enter your weight");
                double weight = scan.nextDouble();

                System.out.println("Are you married?");
                String marriage = scan.next();

                String contact = "work phone number - " + work_number + "," + "personal phone number - " + personal_number + ", " + "email:" + email;
                String fullName = name+ "," + surname;
                String address = street + "," + city + "," + state + zip_code;

                System.out.println("Patient personal information");
                System.out.println("Full name: " + fullName);
                System.out.println("Address: " + address );
                System.out.println("Contacts: " + contact);
                System.out.println("Age: " + age );
                System.out.println("Height: " + height);
                System.out.println("Weight: " + weight);
                System.out.println("Married?:" + marriage);
            }
}
