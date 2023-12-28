import java.time.LocalDate;

public class Student {
    private String firstName;
    private String lastName;
    private int studentID;
    private LocalDate dob;
    private String address;
    private int marks;
    private String major;
    private String gender;
    private String email;
    private String phoneNumber;
    private int extraCurricularID;
    private int teacherID;

    // Constructor
    public Student(String firstName, String lastName, int studentID, LocalDate dob, String address,
                   int marks, String major, String gender, String email, String phoneNumber,
                   int extraCurricularID, int teacherID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.dob = dob;
        this.address = address;
        this.marks = marks;
        this.major = major;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.extraCurricularID = extraCurricularID;
        this.teacherID = teacherID;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public int getMarks() {
        return marks;
    }

    public String getMajor() {
        return major;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getExtraCurricularID() {
        return extraCurricularID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    // Other getter and setter methods...

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentID=" + studentID +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", marks=" + marks +
                ", major='" + major + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", extraCurricularID=" + extraCurricularID +
                ", teacherID=" + teacherID +
                '}';
    }
}
