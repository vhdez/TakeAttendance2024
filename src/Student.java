import java.util.Scanner;

public class Student {
    // fields
    String firstName;
    String lastName;
    int id;
    int graduationYear;

    //methods
    boolean nameMatches(String searchText) {
        if (firstName.equalsIgnoreCase(searchText) || lastName.equalsIgnoreCase(searchText)) {
            return true;
        }
        return false;
    }

    boolean checkID(Scanner readIDScanner) {
        if (this.id > 0) {
            System.out.print("  Is your ID " + this.id + " ? ");
            String confirmed = readIDScanner.nextLine();  // Read user input
            if (confirmed.contains("y") || confirmed.contains("Y")) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.print("  Your ID # is missing,  " + this.firstName + ".  Please type your ID:");
            String typedID = readIDScanner.nextLine();  // Read user input
            this.id = Integer.parseInt(typedID);
            return true;
        }
    }

    void describe() {
        System.out.println("  Student: " + firstName + " " + lastName + " graduating in: " + graduationYear + " (ID: " + id + ")");
    }

}
