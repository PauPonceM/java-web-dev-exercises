package studios;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double radiusInput= input.nextDouble();
        Double areaCircle= Circle.getArea(radiusInput);

        System.out.println(String.format("The area of a circle of radius %s is: %s", radiusInput, areaCircle));
    }
}
