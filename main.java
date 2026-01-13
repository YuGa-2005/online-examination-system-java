import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // default user credentials
        User user = new User("admin", "admin123", "Admin User", "admin@gmail.com");

        System.out.println("=== Online Examination System ===");

        // LOGIN
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (user.login(username, password)) {
            System.out.println("Login Successful!\n");

            int choice;
            do {
                System.out.println("1. Update Profile");
                System.out.println("2. Start Exam");
                System.out.println("3. Change Password");
                System.out.println("4. Logout");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();
                sc.nextLine(); // clear buffer

                switch (choice) {
                    case 1:
                        user.updateProfile(sc);
                        user.showProfile();
                        break;
                    case 2:
                        Exam exam = new Exam();
                        exam.startExam();
                        break;
                    case 3:
                        user.changePassword(sc);
                        break;
                    case 4:
                        System.out.println("Logged out successfully.");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } while (choice != 4);

        } else {
            System.out.println("Invalid username or password!");
        }

        sc.close();
    }
}

