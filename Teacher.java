import java.time.LocalDate;

public class Teacher {
    private int teacherID;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;
    private LocalDate joiningDate;
    private double salary;
    private String firstName;
    private String lastName;
    private String teachingSubject;

    public Teacher(int teacherID, int age, String gender, String email, String phoneNumber,
                   LocalDate joiningDate, double salary, String firstName, String lastName,
                   String teachingSubject) {
        this.teacherID = teacherID;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.joiningDate = joiningDate;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.teachingSubject = teachingSubject;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public int getAge() {
        return age;
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

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public double getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    // Other getter and setter methods...

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", joiningDate=" + joiningDate +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", teachingSubject='" + teachingSubject + '\'' +
                '}';
    }
}
