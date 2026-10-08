import java.util.Scanner;
class MovieTicket{
    private String movieName;
    private double ticketPrice;
    private int noOfTickets;

    public MovieTicket(String movieName, double ticketPrice, int noOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.noOfTickets = noOfTickets;
    }
    public double calculateTotalAmount() {
        return ticketPrice * noOfTickets;

    }
    public double calculateDiscount() {
        if (noOfTickets >= 5) {
            return calculateTotalAmount() * 0.10;
        }
        return 0.0;
    }
    public double calculateFinalAmount() {
        return calculateTotalAmount() - calculateDiscount();
    }
    public void displayBill() {
        
        System.out.println("Movie Name: " + movieName);
        System.out.printf("Ticket Price: %.2f\n", ticketPrice);
        System.out.println("Number of Tickets: " + noOfTickets);
        System.out.printf("Total Amount: %.2f\n", calculateTotalAmount());
        System.out.printf("Discount: %.2f\n", calculateDiscount());
        System.out.printf("Final Amount: %.2f\n", calculateFinalAmount());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();
        System.out.print("Enter Ticket Price: ");
        double ticketPrice = sc.nextDouble();
        System.out.print("Enter Number of Tickets: ");
        int noOfTickets = sc.nextInt();
        MovieTicket ticket = new MovieTicket(movieName, ticketPrice, noOfTickets);
        ticket.displayBill();
    sc.close();
    }
}