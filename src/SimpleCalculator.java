import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String [] args) {
        Scanner fetch = new Scanner(System.in);
        System.out.println("****** Calculator ******");
        System.out.print("Enter operation in symbols (+, -, *, /): ");
        String operation = fetch.next();

        if (operation.equalsIgnoreCase("+")) {
            System.out.println("\n****** Addition *******");
            System.out.print("Enter two numbers to add:\n ");
            int num1 = fetch.nextInt();
            fetch.nextLine();
            int num2 = fetch.nextInt();
            fetch.nextLine();
            System.out.println("The sum of these numbers is " + (num1 + num2));
        } else if (operation.equalsIgnoreCase("-")) {
            System.out.println("\n****** Subtraction *******");
            System.out.print("Enter the number: ");
            int minuend = fetch.nextInt();
            fetch.nextLine();
            System.out.print("Enter how much you want taken away: ");
            int subtrahend = fetch.nextInt();
            fetch.nextLine();
            System.out.println("The difference is " + (minuend - subtrahend));
        } else if (operation.equalsIgnoreCase("*")) {
            System.out.println("\n****** Multiplication *******");
            System.out.print("How many numbers do you want to multiply? ");
            int totalNums = fetch.nextInt();
            fetch.nextLine();
            double product = 1.0;
            for (int i = 0; i < totalNums; i++) {
                System.out.print("Enter number: ");
                double factor = fetch.nextInt();
                fetch.nextLine();
                product *= factor;
            }
            System.out.println("The product is " + product);
        } else if (operation.equalsIgnoreCase("/")) {
            System.out.print("\n****** Division *******");
            System.out.print("\nEnter the dividend: ");
            int dividend = fetch.nextInt();
            fetch.nextLine();
            System.out.print("Enter the divisor: ");
            int divisor = fetch.nextInt();
            fetch.nextLine();
            System.out.println("The quotient of the two numbers is " + (dividend / divisor));
        }


    }
}
