import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = Sc.nextInt();
        int originalNum = num;
        int reverseNum= 0;
        int digit;

        while(num > 0) {
            digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }
            if(originalNum == reverseNum) {
                System.out.println("The Number is Palindrome");
            }
            else{
                System.out.println("The Number is not Palindrome");
            
            }
    }
}
