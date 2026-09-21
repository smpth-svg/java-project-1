import java.util.Scanner;

public class AirportFlightBoard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("     AIRPORT FLIGHT BOARD & SCHEDULER");
        System.out.println("========================================");

        System.out.println("\nAvailable Flights:");
        System.out.println("AI101 - Hyderabad to Delhi");
        System.out.println("6E205 - Mumbai to Bengaluru");
        System.out.println("SG310 - Chennai to Delhi");
        System.out.println("AI405 - Delhi to Hyderabad");
        System.out.println("6E512 - Bengaluru to Mumbai");
        System.out.println("UK620 - Kolkata to Chennai");
        System.out.println("SG725 - Pune to Hyderabad");

        System.out.print("\nEnter Flight Number: ");
        String flight = sc.nextLine();

        if (flight.equalsIgnoreCase("AI101")) {

            System.out.println("\nFlight Details");
            System.out.println("Flight Number : AI101");
            System.out.println("From          : Hyderabad");
            System.out.println("To            : Delhi");
            System.out.println("Boarding Time : 10:00 AM");
            System.out.println("Departure Time: 10:30 AM");

        } else if (flight.equalsIgnoreCase("6E205")) {

            System.out.println("\nFlight Details");
            System.out.println("Flight Number : 6E205");
            System.out.println("From          : Mumbai");
            System.out.println("To            : Bengaluru");
            System.out.println("Boarding Time : 11:00 AM");
            System.out.println("Departure Time: 11:30 AM");

        } else if (flight.equalsIgnoreCase("SG310")) {

            System.out.println("\nFlight Details");
            System.out.println("Flight Number : SG310");
            System.out.println("From          : Chennai");
            System.out.println("To            : Delhi");
            System.out.println("Boarding Time : 12:30 PM");
            System.out.println("Departure Time: 01:00 PM");

        } else if (flight.equalsIgnoreCase("AI405")) {

            System.out.println("\nFlight Details");
            System.out.println("Flight Number : AI405");
            System.out.println("From          : Delhi");
            System.out.println("To            : Hyderabad");
            System.out.println("Boarding Time : 02:00 PM");
            System.out.println("Departure Time: 02:30 PM");

        } else if (flight.equalsIgnoreCase("6E512")) {

            System.out.println("\nFlight Details");
            System.out.println("Flight Number : 6E512");
            System.out.println("From          : Bengaluru");
            System.out.println("To            : Mumbai");
            System.out.println("Boarding Time : 03:30 PM");
            System.out.println("Departure Time: 04:00 PM");

        } else if (flight.equalsIgnoreCase("UK620")) {

            System.out.println("\nFlight Details");
            System.out.println("Flight Number : UK620");
            System.out.println("From          : Kolkata");
            System.out.println("To            : Chennai");
            System.out.println("Boarding Time : 05:00 PM");
            System.out.println("Departure Time: 05:30 PM");

        } else if (flight.equalsIgnoreCase("SG725")) {

            System.out.println("\nFlight Details");
            System.out.println("Flight Number : SG725");
            System.out.println("From          : Pune");
            System.out.println("To            : Hyderabad");
            System.out.println("Boarding Time : 06:30 PM");
            System.out.println("Departure Time: 07:00 PM");

        } else {

            System.out.println("\nFlight not found!");

        }

        sc.close();
    }
}
