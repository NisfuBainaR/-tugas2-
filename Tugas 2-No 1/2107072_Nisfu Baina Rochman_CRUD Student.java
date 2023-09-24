import java.util.Scanner;
import java.util.List;

public class ${NAME} {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDatabase database = new StudentDatabase();

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add a new student");
            System.out.println("2. Update a student");
            System.out.println("3. See all students");
            System.out.println("4. See specific student by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character

                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter student major: ");
                    String major = scanner.nextLine();

                    System.out.print("Enter student semester: ");
                    int semester = scanner.nextInt();

                    System.out.print("Enter student year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character

                    System.out.print("Enter student gender: ");
                    String gender = scanner.nextLine();

                    Student newStudent = new Student(id, name, major, semester, year, gender);
                    database.addStudent(newStudent);
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    System.out.print("Enter student ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character

                    Student existingStudent = database.getStudentById(updateId);
                    if (existingStudent != null) {
                        System.out.print("Enter updated student name: ");
                        String updatedName = scanner.nextLine();

                        System.out.print("Enter updated student major: ");
                        String updatedMajor = scanner.nextLine();

                        System.out.print("Enter updated student semester: ");
                        int updatedSemester = scanner.nextInt();

                        System.out.print("Enter updated student year: ");
                        int updatedYear = scanner.nextInt();
                        scanner.nextLine();  // Consume the newline character

                        System.out.print("Enter updated student gender: ");
                        String updatedGender = scanner.nextLine();

                        Student updatedStudent = new Student(updateId, updatedName, updatedMajor, updatedSemester, updatedYear, updatedGender);
                        database.updateStudent(updateId, updatedStudent);
                        System.out.println("Student updated successfully.");
                    } else {
                        System.out.println("Student with ID " + updateId + " not found.");
                    }
                    break;
                case 3:
                    List<Student> allStudents = database.getAllStudents();
                    System.out.println("\nAll Students:");
                    for (Student student : allStudents) {
                        System.out.println(student);
                    }
                    break;
                case 4:
                    System.out.print("Enter student ID to view: ");
                    int viewId = scanner.nextInt();
                    Student student = database.getStudentById(viewId);
                    if (student != null) {
                        System.out.println("\nStudent Details:");
                        System.out.println(student);
                    } else {
                        System.out.println("Student with ID " + viewId + " not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
