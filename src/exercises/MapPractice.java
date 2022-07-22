package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPractice {
    public static void main(String[] args){

        HashMap<Integer, String> roster = new HashMap<>();
        Scanner input= new Scanner(System.in);
        String newStudent;

        System.out.println("Enter student ID (or ENTER to finish): ");

        do{
            System.out.println("Student name: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("Student ID: ");
                Integer newStudentID= input.nextInt();
                roster.put(newStudentID, newStudent);

                input.nextLine();
            }
        } while(!newStudent.equals(""));
    input.close();
        System.out.println("\nClass roster:");

            for(Map.Entry<Integer, String> student: roster.entrySet()) {
                System.out.println(student.getKey() + " " + student.getValue());
            }
    }
}
