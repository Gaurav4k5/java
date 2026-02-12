import java.util.Scanner;
public class CWG_05_takingInput {
    public static void main(String[] args) {
        System.out.println("Taking input");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number 1 :");
            int a = sc.nextInt();
            System.out.println("Enter number 2 :");
            int b = sc.nextInt();
            int sum  =  a + b ;
            System.out.println("the sum of these numbers id :");
            System.out.println(sum);
        }
    }
}
