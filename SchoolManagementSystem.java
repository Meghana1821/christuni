import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        List<ExtraCurricularActivity> activities = new ArrayList<>();

        int choice;
        do {
            System.out.println("Select an option:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Add Extra Curricular Activity");
            System.out.println("4. Show All Data");
            System.out.println("5. Delete Student");
            System.out.println("6. Delete Teacher");
            System.out.println("7. Delete Extra Curricular Activity");
            System.out.println("8. Display Student Details by ID");
            System.out.println("9. Display Teacher Details by ID");
            System.out.println("10. Display Extra Curricular Activity Details by ID");
            System.out.println("11. Exit");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent(scanner, students);
                    break;
                case 2:
                    addTeacher(scanner, teachers);
                    break;
                case 3:
                    addExtraCurricularActivity(scanner, activities);
                    break;
                case 4:
                    showAllData(students, teachers, activities, scanner);
                    break;
                case 5:
                    deleteStudent(scanner, students);
                    break;
                case 6:
                    deleteTeacher(scanner, teachers);
                    break;
                case 7:
                    deleteExtraCurricularActivity(scanner, activities);
                    break;
                case 8:
                    displayStudentDetailsById(students, scanner);
                    break;
                case 9:
                    displayTeacherDetailsById(teachers, scanner);
                    break;
                case 10:
                    displayActivityDetailsById(activities, scanner);
                    break;
                case 11:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 11.");
                    break;
            }
        } while (choice != 11);
    }

    private static void addStudent(Scanner scanner, List<Student> students) {
        System.out.println("Enter student details:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Student ID: ");
        int studentID = scanner.nextInt();
        System.out.print("Date of Birth (YYYY-MM-DD): ");
        LocalDate dob = parseDate(scanner.next());
        scanner.nextLine(); // Consume newline
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Marks: ");
        int marks = scanner.nextInt();
        System.out.print("Major: ");
        String major = scanner.next();
        System.out.print("Gender: ");
        String gender = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.next();
        System.out.print("Extra Curricular ID: ");
        int extraCurricularID = scanner.nextInt();
        System.out.print("Teacher ID: ");
        int teacherID = scanner.nextInt();

        Student student = new Student(firstName, lastName, studentID, dob, address, marks, major,
                gender, email, phoneNumber, extraCurricularID, teacherID);
        students.add(student);

        System.out.println("Student added successfully!\n");
    }

    private static void addTeacher(Scanner scanner, List<Teacher> teachers) {
        System.out.println("Enter teacher details:");
        System.out.print("First Name: ");
        String firstName = scanner.next();
        System.out.print("Last Name: ");
        String lastName = scanner.next();
        System.out.print("Teacher ID: ");
        int teacherID = scanner.nextInt();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Gender: ");
        String gender = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.next();
        System.out.print("Joining Date (YYYY-MM-DD): ");
        LocalDate joiningDate = parseDate(scanner.next());
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Teaching Subject: ");
        String teachingSubject = scanner.next();

        Teacher teacher = new Teacher(teacherID, age, gender, email, phoneNumber, joiningDate,
                salary, firstName, lastName, teachingSubject);
        teachers.add(teacher);

        System.out.println("Teacher added successfully!\n");
    }

    private static void addExtraCurricularActivity(Scanner scanner, List<ExtraCurricularActivity> activities) {
        System.out.println("Enter extra-curricular activity details:");
        System.out.print("Activity ID: ");
        int activityID = scanner.nextInt();
        System.out.print("Activity Name: ");
        String activityName = scanner.next();
        System.out.print("Description: ");
        String description = scanner.next();
        System.out.print("Category: ");
        String category = scanner.next();
        System.out.print("Location: ");
        String location = scanner.next();
        System.out.print("Schedule: ");
        String schedule = scanner.next();
        System.out.print("Leader: ");
        String leader = scanner.next();
        System.out.print("Participants (comma-separated): ");
        String participantsString = scanner.next();
        List<String> participants = List.of(participantsString.split(","));
        System.out.print("Start Date (YYYY-MM-DD): ");
        LocalDate startDate = parseDate(scanner.next());
        System.out.print("End Date (YYYY-MM-DD): ");
        LocalDate endDate = parseDate(scanner.next());
        System.out.print("Cost: ");
        double cost = scanner.nextDouble();

        ExtraCurricularActivity activity = new ExtraCurricularActivity(activityID, activityName,
                description, category, location, schedule, leader, participants, startDate, endDate, cost);
        activities.add(activity);

        System.out.println("Extra-curricular activity added successfully!\n");
    }

    private static void deleteStudent(Scanner scanner, List<Student> students) {
        System.out.print("Enter Student ID to delete: ");
        int studentIDToDelete = scanner.nextInt();

        students.removeIf(student -> student.getStudentID() == studentIDToDelete);

        System.out.println("Student with ID " + studentIDToDelete + " deleted successfully!\n");
    }

    private static void deleteTeacher(Scanner scanner, List<Teacher> teachers) {
        System.out.print("Enter Teacher ID to delete: ");
        int teacherIDToDelete = scanner.nextInt();

        teachers.removeIf(teacher -> teacher.getTeacherID() == teacherIDToDelete);

        System.out.println("Teacher with ID " + teacherIDToDelete + " deleted successfully!\n");
    }

    private static void deleteExtraCurricularActivity(Scanner scanner, List<ExtraCurricularActivity> activities) {
        System.out.print("Enter Activity ID to delete: ");
        int activityIDToDelete = scanner.nextInt();

        activities.removeIf(activity -> activity.getActivityID() == activityIDToDelete);

        System.out.println("Activity with ID " + activityIDToDelete + " deleted successfully!\n");
    }

    private static void showAllData(List<Student> students, List<Teacher> teachers,
                                    List<ExtraCurricularActivity> activities, Scanner scanner) {
        System.out.println("Student Data:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nTeacher Data:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }

        System.out.println("\nExtra Curricular Activity Data:");
        for (ExtraCurricularActivity activity : activities) {
            System.out.println(activity);
        }
        System.out.println();
    }

    private static void displayStudentDetailsById(List<Student> students, Scanner scanner) {
        System.out.print("Enter Student ID to display details: ");
        int studentIDToDisplay = scanner.nextInt();

        for (Student student : students) {
            if (student.getStudentID() == studentIDToDisplay) {
                System.out.println("Student Data for ID " + studentIDToDisplay + ":");
                System.out.println("First Name: " + student.getFirstName());
                System.out.println("Last Name: " + student.getLastName());
                System.out.println("DOB: " + student.getDob());
                System.out.println("Address: " + student.getAddress());
                System.out.println("Marks: " + student.getMarks());
                System.out.println("Major: " + student.getMajor());
                System.out.println("Gender: " + student.getGender());
                System.out.println("Email: " + student.getEmail());
                System.out.println("Phone Number: " + student.getPhoneNumber());
                System.out.println("Extra Curricular ID: " + student.getExtraCurricularID());
                System.out.println("Teacher ID: " + student.getTeacherID() + "\n");
                return;
            }
        }

        System.out.println("Student with ID " + studentIDToDisplay + " not found.\n");
    }

    private static void displayTeacherDetailsById(List<Teacher> teachers, Scanner scanner) {
        System.out.print("Enter Teacher ID to display details: ");
        int teacherIDToDisplay = scanner.nextInt();

        for (Teacher teacher : teachers) {
            if (teacher.getTeacherID() == teacherIDToDisplay) {
                System.out.println("Teacher Data for ID " + teacherIDToDisplay + ":");
                System.out.println("First Name: " + teacher.getFirstName());
                System.out.println("Last Name: " + teacher.getLastName());
                System.out.println("Age: " + teacher.getAge());
                System.out.println("Gender: " + teacher.getGender());
                System.out.println("Email: " + teacher.getEmail());
                System.out.println("Phone Number: " + teacher.getPhoneNumber());
                System.out.println("Joining Date: " + teacher.getJoiningDate());
                System.out.println("Salary: " + teacher.getSalary());
                System.out.println("Teaching Subject: " + teacher.getTeachingSubject() + "\n");
                return;
            }
        }

        System.out.println("Teacher with ID " + teacherIDToDisplay + " not found.\n");
    }

    private static void displayActivityDetailsById(List<ExtraCurricularActivity> activities, Scanner scanner) {
        System.out.print("Enter Activity ID to display details: ");
        int activityIDToDisplay = scanner.nextInt();

        for (ExtraCurricularActivity activity : activities) {
            if (activity.getActivityID() == activityIDToDisplay) {
                System.out.println("Extra Curricular Activity Data for ID " + activityIDToDisplay + ":");
                System.out.println("Activity Name: " + activity.getActivityName());
                System.out.println("Description: " + activity.getDescription());
                System.out.println("Category: " + activity.getCategory());
                System.out.println("Location: " + activity.getLocation());
                System.out.println("Schedule: " + activity.getSchedule());
                System.out.println("Leader: " + activity.getLeader());
                System.out.println("Participants: " + activity.getParticipants());
                System.out.println("Start Date: " + activity.getStartDate());
                System.out.println("End Date: " + activity.getEndDate());
                System.out.println("Cost: " + activity.getCost() + "\n");
                return;
            }
        }

        System.out.println("Activity with ID " + activityIDToDisplay + " not found.\n");
    }

    private static LocalDate parseDate(String dateString) {
        try {
            return LocalDate.parse(dateString);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD.");
            throw new IllegalArgumentException("Invalid date format", e);
        }
    }
}
