import java.util.Scanner;

public class LoginView {

    public static void main(String[] args) {
        final String email, password;

        // User inputs
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter email: ");
        email = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter password: ");
        password = input2.next();

        Login login = new Login(email, password);

        if (login.signIn() == 1)
            System.out.println("Access Granted! Welcome to the social care system!");
        else
            System.out.println("Invalid email and/or password!");
    }
}