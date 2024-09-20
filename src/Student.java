import java.util.Scanner;

class Student {
    // fields
    private String firstName;
    private String lastName;
    private int id;
    private int graduationYear;
    private boolean isPresent;
    private boolean feesPaid;
    private int cash;
    private int check;
    private int creditCardNumber;

    // Constructors

    public Student(String firstName, String lastName, int id, int graduationYear, int creditCardNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.graduationYear = graduationYear;
        this.creditCardNumber = creditCardNumber;
    }

    public Student(String firstName, String lastName, int id, int graduationYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.graduationYear = graduationYear;
    }

    // Getter and setter methods
    int getCash() {
        return cash;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public boolean isFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(boolean feesPaid) {
        this.feesPaid = feesPaid;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }

    public int getCreditCardNumber(Teacher teacher) {
        if (teacher.getName().equalsIgnoreCase("Mr. Reddy")) {
            return creditCardNumber;
        } else {
            System.out.println("FRAUD DETECTED.  Perpetrator is: " + teacher.getName());
            return -1;
        }

    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    //methods

    boolean isPresent() {
        return isPresent;
    }

    void markPresent() {
        isPresent = true;
    }
    boolean nameMatches(String searchText) {
        if (firstName.equalsIgnoreCase(searchText) || lastName.equalsIgnoreCase(searchText)) {
            return true;
        }
        return false;
    }

    boolean checkID(Scanner readIDScanner) {
        this.describe();
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
