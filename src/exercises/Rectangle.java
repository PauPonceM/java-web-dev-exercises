package exercises;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Length of Rectangle: ");
        Double length= input.nextDouble();

        System.out.println("Width of Rectangle: ");
        Double width= input.nextDouble();

        Double area= length * width;
        System.out.println("Area of rectangle is " + area);

    }
}
