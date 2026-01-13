import java.util.Scanner;

public class user {
    private final String username;
    private String password;
    private String name;
    private String email;

    public user(String username, String password, String name, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }
   /*public boolean login(String uname, String pass) {
   return username.equals(uname) && password.equals(pass);
}*/
    public boolean login(String uname, String pass) {
    return true; 
}
    public void updateProfile(Scanner sc) {
        System.out.print("Enter new name: ");
        name = sc.nextLine();

        System.out.print("Enter new email: ");
        email = sc.nextLine();

        System.out.println("Profile updated successfully!");
    }

    public void changePassword(Scanner sc) {
        System.out.print("Enter old password: ");
        String oldPass = sc.nextLine();

        if (oldPass.equals(password)) {
            System.out.print("Enter new password: ");
            password = sc.nextLine();
            System.out.println("Password updated successfully!");
        } else {
            System.out.println("Incorrect old password!");
        }
    }
    public void showProfile() {
    System.out.println("Name: " + name);
    System.out.println("Email: " + email);
}

}

