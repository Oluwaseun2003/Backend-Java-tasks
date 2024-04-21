import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        System.out.println("In this task, uou will input two numbers to perform basic operations");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first digit");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second digit");
        double num2 = scanner.nextDouble();


        //Arithmetic Operations

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double division = num1 / num2;

        //Results
        System.out.println("The sum of the two digits is" + " " + sum );
        System.out.println("The difference of the two digits is" + " " + difference);
        System.out.println("The product of the two digits is" + " " + product);
        System.out.println("The division of the two digits is" + " " + division);
    }
}
