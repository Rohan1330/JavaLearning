import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a 10 digit Number to find if it is a Palindrome");
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        int ogNum = num;
        int remainder;
        int reverse = 0;

        while (num != 0){
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num/10;
        }
        if (ogNum == reverse) {
            System.out.println(ogNum + " is a Palindrome");
        }
        else {
            System.out.println(ogNum + " is not a Palindrome");
        }
    }
}
