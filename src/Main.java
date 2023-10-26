import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input1 = "yes";

        String[] methodArray = new String[3];
        methodArray[0] = "1.) Cramer's Rule";
        methodArray[1] = "2.) Substitution";
        methodArray[2] = "3.) Reduced Row Echelon";

        System.out.println("Hello User, Welcome to the Sales Calculator Program");
        System.out.println("Hello, would you like to select a specific algorithm?");
        System.out.println(" ");
        System.out.println("(Defaults to Cramer's rule)");
        String yesno = scan.nextLine();

        if (yesno.equalsIgnoreCase(input1)) {
            System.out.println("What method would you like to use?");
            System.out.println(" ");
            System.out.println(methodArray[0]);
            // Add code here to handle the user's method selection.
        } else {
            System.exit(1);
        }
    }
}
