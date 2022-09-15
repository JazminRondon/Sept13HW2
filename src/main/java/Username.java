import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        Scanner inputUser= new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = inputUser.nextLine();
        System.out.println("Hey " + name);
    }
}


// https://www.w3schools.com/java/java_user_input.asp