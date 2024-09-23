import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String string1 = "Hi class!";
        String string2 = string1.toUpperCase();
        System.out.println(string2);

        Student student1 = new Student("Twyla", "Nunes-Ueno", 10107967, 2025, 1234567890 );
        Student student2 = new Student("Royde'sha", "Richardson", 8485432, 2025);
        Student student3 = new Student("Shoeb", "Sadi", 8661668, 2026);
        Student student4 = new Student("Gabriel", "Solano",8283452,2025);
        Student student5 = new Student("Dylan","Parchman",0,0);

        Teacher teacher1 = new Teacher("Mr. Reddy");
        Teacher teacher2 = new Teacher("Mr. Hernandez", student1, student2, student3, student4, student5);

        System.out.println(teacher1);
        System.out.println(teacher2);

        teacher2.goShopping();
        teacher1.collectFees(student1);

        Scanner myTextScanner = new Scanner(System.in);  // Create a Scanner object
        boolean stillAsk = true;
        while (stillAsk) {
            System.out.print("Taking attendance.  Type your name: ");
            String nameTyped = myTextScanner.nextLine();  // Read user input

            Student studentSigningIn = teacher2.findStudent(nameTyped);
            if (studentSigningIn == null) {
                System.out.println("NO student named: " + nameTyped);
            } else {
                boolean idMatches = studentSigningIn.checkID(myTextScanner);
                studentSigningIn.markPresent(idMatches);
            }

            if (nameTyped.equals("DONE")) {
                stillAsk = false;
            }
        }
    }

}