import java.util.Scanner;

public class CWG_18Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String var = sc.nextLine();
        // int day = sc.nextInt();
        // switch (day) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.println("Invalid input. Please enter a number between 1 and 7.");
        // }
        switch (var) {
            case "shubham" -> {
                System.out.println("Hello Shubham");
                System.out.println("Welcome to Java Programming");
                System.out.println("how are you doing? ");

            }
            case "satyarth" -> System.out.println("Hello Satyarth");
            case "satyam" -> System.out.println("Hello Satyam");
            default -> System.out.println("Invalid input. Please enter a valid name.");
        }
    }
}
