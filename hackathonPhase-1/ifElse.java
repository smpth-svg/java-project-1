import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the generated energy in kWh : ");
        double energy = sc.nextDouble();

        if(energy >= 10){
            System.out.println("Good energy generation");
        } else {
            System.out.println("Low energy generation");
        }
        sc.close();
    }
    
}
