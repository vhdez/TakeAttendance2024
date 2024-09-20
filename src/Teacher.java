import javax.swing.*;

public class Teacher {
    private String name;
    private Student student1;
    private Student student2;

    // Constructors

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, Student student1, Student student2) {
        this.name = name;
        this.student1 = student1;
        this.student2 = student2;
    }

    // Getters/Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent1() {
        return student1;
    }

    public void setStudent1(Student student1) {
        this.student1 = student1;
    }

    public Student getStudent2() {
        return student2;
    }

    public void setStudent2(Student student2) {
        this.student2 = student2;
    }

    // Methods
    boolean takeAttendance() {
        if (student1.isPresent() && student2.isPresent()) {
            return true;
        }

        return false;
    }

    void collectFees(Student student) {
            if  (student.getCash() > 45) {
                student.setFeesPaid(true);
            } else if (student.getCheck() > 45) {
                student.setFeesPaid(true);
            } else {
                System.out.println("Charging $45 to credit card " + student.getCreditCardNumber(this));
            }
    }

    void goShopping() {
        System.out.println("Buying $110 shoes on credit card number" + student2.getCreditCardNumber(this));
    }
}
