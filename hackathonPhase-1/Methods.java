import java.util.Scanner;

public class Methods {

    public static double calcTotEnergy(double morningEner, double eveningEner) {
        return morningEner + eveningEner;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter the energy  generated in kWh for morning: ");
        double morning = sc.nextDouble();
        System.out.println("Enter the energy  generated in kWh for evening: ");
        double evening = sc.nextDouble();

        double totalEnergy = calcTotEnergy(morning, evening);

    
        System.out.println(totalEnergy);

        sc.close();
    }
}