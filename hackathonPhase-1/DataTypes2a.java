import java.util.Scanner;
public class DataTypes2a{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your Panel ID: ");
        int PanelID=sc.nextInt();

        System.out.println("Enter the amount of Energy generated in kWh: ");
        double Energy=sc.nextDouble();

        System.out.println("Enter numer of Solar panels:");
        int noSpanels=sc.nextInt();

        System.out.println("Enter the Status");
        char status=sc.next().charAt(0);

        System.out.println("Panel ID -" + PanelID);
         System.out.println("Energy generated in kWh - " + Energy);
         System.out.println("Number of Solar Panels - " + noSpanels);
         System.out.println("System Status - " + status);


    sc.close();


    }
}