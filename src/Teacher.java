import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class Teacher {
    private String name;
    private ArrayList<Student> allStudents;

    // Constructors

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, Student student1, Student student2) {
        this.name = name;
        this.allStudents = new ArrayList<Student>();
        allStudents.add(student1);
        allStudents.add(student2);
    }

    public Teacher(String name, Student student1, Student student2, Student student3, Student student4, Student student5) {
        this.name = name;
        this.allStudents = new ArrayList<Student>();
        allStudents.add(student1);
        allStudents.add(student2);
        allStudents.add(student3);
        allStudents.add(student4);
        allStudents.add(student5);
    }

    // Getters/Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent(int studentNum) {
        return allStudents.get(studentNum);
    }

    // Methods
    boolean takeAttendance() {
        boolean allPresent = true;
        for (Student student : allStudents) {
            if (!student.isPresent()) {
                allPresent = false;
            }
        };

        return allPresent;
    }

    void collectFees(Student student) {
        if  (student.getCash() > 45) {
            student.setFeesPaid(true);
            student.setCash(student.getCash() - 45);
            System.out.println(this.name + " collected fess from: " + student + " who paid $45 fees using cash.");
        } else if (student.getCheck() > 45) {
            student.setFeesPaid(true);
            student.setCheck(student.getCheck() - 45);
            System.out.println(this.name + " collected fess from: " + student + " who paid $45 fees using check.");
        } else {
            System.out.println(this.name + " collected fess from: " + student + " who paid $45 fees using credit card " + student.getCreditCardNumber(this));
        }
    }

    void goShopping() {
        // Try to use ANY student's credit card
        int creditCardToUse = -1;
        for (Student student : allStudents) {
            int studentCreditCard = student.getCreditCardNumber(this);
            if (studentCreditCard > 0) {
                creditCardToUse = studentCreditCard;
            }
        };

        if (creditCardToUse > 0) {
            System.out.println(this.name + " buying $110 shoes on credit card number " + creditCardToUse);
        } else {
            System.out.println(this.name + " CAN'T go shopping.  Unable to steal a student's credit card :-(");
        }
    }

    Student findStudent(String possibleName) {
        Student foundStudent = null;
        for (Student student : allStudents) {
            if (student.nameMatches(possibleName)) {
                foundStudent = student;
            }
        }
        return foundStudent;
    }

    public String toString() {
        return "Teacher " + this.name + " has students " + allStudents;
    }
}
