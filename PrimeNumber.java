import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //Write a program to accept number from keyboard and check if it is a prime number
        //1. Accept number
        //2. Determine if it is a prime number
            //2.1 for it to be a prime number is only divisible by 1 or itself
            //2.2 divide number starting from 2 till we reach 1 before the number
        //3. Output to user yes or no
        System.out.println("Enter a 10 digit number that will be checked to see if it is a prime number");
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        int divider = 2;

        while (divider < num) {
            if (num % divider == 0)
                break;
            divider ++;
        }
        if (divider == num)
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");
    }
}
