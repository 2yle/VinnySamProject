import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {//commit
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ProgramRESTART programRestart = new ProgramRESTART(); // calls from ProgramRESTART class
        SleepThread SleepThread = new SleepThread(); // calls from SleepThread Class

        // Something to declare:

        String input1 = "yes";
        String input2;
        String help = "help";
        int numchoose;

// COLORED TEXT:

        String RESET = "\u001B[0m"; // RETURNS CODE BACK TO ORIGINAL COLOR
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";

// Cramer's Rule's Variables and solving algorithm:

        double x1, x2, y1, y2;
        double a1, a2, b1, b2, c1, c2;
        double dx = 0, dy = 0, d = 0;

        double x = dx / d;
        double y = dy / d;

// Cramer's Rule's 4x4? Matrix Lists? Arrays?


// Reduced Row Echelon:


// Nonlinear System of Equations:


// Options to choose from://

        String[] methodArray = new String[4];

        methodArray[0] = "1.) Cramer's Rule";
        methodArray[1] = "2.) Substitution";
        methodArray[2] = "3.) Reduced Row Echelon";
        methodArray[3] = RED + "4.) HELP" + RESET;

        // Prompt starts here:

        //System.lineSeparator is just another way to indent. (Starting an empty line)

        System.out.println("Welcome to the Sales Calculator Program:\n" + " ");
        SleepThread.main(new String[0]);
        System.out.println("1.) Start");
        SleepThread.main(new String[0]);
        System.out.println("2.) Select an Algorithm");
        SleepThread.main(new String[0]);
        System.out.println("3.) Help\n ");
        SleepThread.main(new String[0]);

        numchoose = scan.nextInt();

        /* Switch Statements: */
        switch (numchoose) {
            case 1 -> {
                SleepThread.main(new String[0]);
                System.out.println("Start\n");
                System.out.println("What is the name of the product?");
            }
            case 2 -> {
                System.out.println("Select an Algorithm\n");
                SleepThread.main(new String[0]);
                System.out.println(methodArray[0]);
                SleepThread.main(new String[0]);
                System.out.println(methodArray[1]);
                SleepThread.main(new String[0]);
                System.out.println(methodArray[2]);
                SleepThread.main(new String[0]);
                System.out.println(methodArray[3]);
                SleepThread.main(new String[0]);
            }
            case 3 -> {
                SleepThread.main(new String[0]);
                System.out.println("HELP\n");
            }
            default -> {
                System.out.println(RED + "ERROR 01: NOT AN OPTION");
                System.out.println("RETURNING TO MAIN MENU . . .\n" + RESET);
                 try {
                    Thread.sleep(1500, 1500); // Pause for 3 seconds
                 } catch (InterruptedException e) {
                    e.printStackTrace(); // Handle the exception (if needed); // runs the program from class SleepThread
                 }
                programRestart.restartProgram();

            }
        }
    } // System.exit(1); for exiting code.
}


