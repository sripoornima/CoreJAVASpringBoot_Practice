package list;

import java.util.ArrayList;

public class Student {

    private int studentID;
    private String studentName;
    private int studentMarks;

    // Constructor injection
    public Student(int studentID, String studentName, int studentMarks) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentMarks = studentMarks;
    }

    // Default constructor (for setter injection)
    public Student() {}

    // Getter and Setter methods
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(int studentMarks) {
        this.studentMarks = studentMarks;
    }

    public static void main(String[] args) {
        // Using constructor injection
        Student s1 = new Student(101, "Zara", 96);
        Student s2 = new Student(102, "John", 88);

        // Using setter injection
        Student s3 = new Student();
        s3.setStudentID(103);
        s3.setStudentName("Mia");
        s3.setStudentMarks(91);

        Student s4 = new Student();
        s4.setStudentID(104);
        s4.setStudentName("Alex");
        s4.setStudentMarks(85);

        Student s5 = new Student();
        s5.setStudentID(105);
        s5.setStudentName("Liam");
        s5.setStudentMarks(78);

        // Create ArrayList of Student
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        // Display all students
        for (Student s : studentList) {
            System.out.println("ID: " + s.getStudentID() + ", Name: " + s.getStudentName() + ", Marks: " + s.getStudentMarks());
        }
    }
}
