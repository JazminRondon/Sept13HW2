import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String userinput = input.nextLine();
        if(userinput == "Bob"){
            System.out.println("Hey " + userinput);
        if (userinput == "Alice"){
            System.out.println("Hey " + userinput);
        }

        }
  //      String name = inputUser.nextLine();
  //      System.out.println("Hey " + name);
    }
}


// https://www.w3schools.com/java/java_user_input.asp