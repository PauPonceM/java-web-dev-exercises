package exercises;
import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("How many miles have you driven? ");
        Double numMiles= input.nextDouble();

        System.out.println("How much gas did you use? in gallons: ");
        Double gas= input.nextDouble();

        Double milesPerGas= numMiles / gas;
        System.out.println("You are running on " + milesPerGas + "mpg.");
    }
}
