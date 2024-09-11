import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi class!");

        Student student1 = new Student();
        student1.firstName = "Twyla";
        student1.lastName = "Nunes-Ueno";
        student1.id = 10107967;
        student1.graduationYear = 2025;

        Student student2 = new Student();
        student2.firstName = "Royde'sha";
        student2.lastName = "Richardson";
        student2.id = 8485432;
        student2.graduationYear = 2025;

        Student student3 = new Student();
        student3.firstName = "Shoeb";
        student3.lastName = "Sadi";
        student3.id = 8661668;
        student3.graduationYear = 2026;

        Student student4 = new Student();
        student4.firstName = "Gabriel";
        student4.lastName = "Solano";
        student4.id = 8283452;
        student4.graduationYear = 2025;

        Student student5 = new Student();
        student5.firstName = "Dylan";
        student5.lastName = "Parchman";
        student5.id = 0;
        student5.graduationYear = 0;

        Scanner myTextScanner = new Scanner(System.in);  // Create a Scanner object
        boolean stillAsk = true;
        while (stillAsk) {
            System.out.println("");
            System.out.print("Name please: ");
            String nameTyped = myTextScanner.nextLine();  // Read user input
            System.out.println(" THANKS!");

            if (nameTyped.equals("DONE")) {
                stillAsk = false;
                continue;
            }

            Student studentFound = null;
            if (student1.nameMatches(nameTyped)) {
                studentFound = student1;
            } else if (student2.nameMatches(nameTyped)) {
                studentFound = student2;
            } else if (student3.nameMatches(nameTyped)) {
                studentFound = student3;
            } else if (student4.nameMatches(nameTyped)) {
                studentFound = student4;
            } else if (student5.nameMatches(nameTyped)) {
                studentFound = student5;
            }

            if (studentFound == null) {
                System.out.println("You are unknown, " + nameTyped + "!  NOT marked PRESENT!");
            } else {
                boolean idMatches = studentFound.checkID(myTextScanner);
                studentFound.describe();
                if (idMatches) {
                    System.out.println("Marking this student PRESENT!");
                } else {
                    System.out.println("NOT Marking this student PRESENT!");
                }
            }
        }
    }

}