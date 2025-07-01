import java.util.Scanner;

public class Calculator {
    public static void main(String[] stmts){
        Scanner input = new Scanner(System.in);
        int choice;

        do{
            System.out.println( " *** Calculation Operations *** ");
            System.out.println( "0 - Exit ");
            System.out.println( "1 - sum ");
            System.out.println( "2 - substract ");
            System.out.println( "3 - multiply ");
            System.out.println( "4 - divide ");
            System.out.println( "5 - exponent ");
            System.out.println( "6 - sqrrt ");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch(choice) {
                case 0 -> System.out.println("Exit!!");
                case 1 -> {
                    System.out.print("First number:");
                    double num1 = input.nextDouble();
                    System.out.print("Second number:");
                    double num2 = input.nextDouble();
                    System.out.println("Result: " + (num1 + num2));
                }
                case 2 ->{
                    System.out.print("First number:");
                    double num1 = input.nextDouble();
                    System.out.print("Second number:");
                    double num2 = input.nextDouble();
                    System.out.println("Result: " + (num1 - num2));
                }
                case 3 ->{
                    System.out.print("First number:");
                    double num1 = input.nextDouble();
                    System.out.print("Second number:");
                    double num2 = input.nextDouble();
                    System.out.println("Result: " + (num1 * num2));
                }
                case 4 ->{
                    System.out.print("First number:");
                    double num1 = input.nextDouble();
                    System.out.print("Second number:");
                    double num2 = input.nextDouble();
                    System.out.println("Result: " + (num1 / num2));
                }
                case 5 ->{
                    System.out.println("Base: ");
                    double base = input.nextDouble();
                    System.out.print("exponent: ");
                    double exponent = input.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exponent));
                }
                case 6 ->{
                    System.out.print("number:");
                    double number = input.nextDouble();
                    if (number >= 0){
                        System.out.println("Result: " + Math.sqrt(number));
                    } else {
                        System.out.println("ERROR: NEGATIVE NUMBER!!!");
                    }
                }
                default -> System.out.println("invalid choice!!!");
            }

            System.out.println();

        }while (choice !=0);

        input.close();
    }

}