import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Hi class!");

        Student student1 = new Student("Twyla", "Nunes-Ueno", 10107967, 2025, 1234567890 );
        Student student2 = new Student("Royde'sha", "Richardson", 8485432, 2025);
        Student student3 = new Student("Shoeb", "Sadi", 8661668, 2026);
        Student student4 = new Student("Gabriel", "Solano",8283452,2025);
        Student student5 = new Student("Dylan","Parchman",0,0);

        Teacher teacher1 = new Teacher("Mr. Reddy");
        Teacher teacher2 = new Teacher("Mr. Hernandez", student2,student1);
        teacher2.takeAttendance();
        teacher2.goShopping();

        teacher1.collectFees(student1);

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
                if (idMatches) {
                    studentFound.markPresent();
                    System.out.println("Marking this student PRESENT!");
                } else {
                    System.out.println("NOT Marking this student PRESENT!");
                }
                studentFound.describe();
            }
        }
    }

}