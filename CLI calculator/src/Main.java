import java.util.Scanner;


public class Main {
    private static Object Operator;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the CLI Calculator");
        int num1 , num2, Result;
        char operator = 0;
        System.out.println("Operations:");
        System.out.println('+');
        System.out.println('-');
        System.out.println('*');
        System.out.println('/');
        System.out.println("e: Exit");
        System.out.println("Choose your Operation:");
        Operator = scanner.next();
        System.out.println("First Number:");
        num1 = scanner.nextInt();
        System.out.println("Second Number:");
        num2 = scanner.nextInt();

        switch( operator ){
                case '+':
                    System.out.println( num1 + num2);
                break;

                case 's':
                    System.out.println("num1 - num2");
                break;

            case 'm':
                System.out.println("num1 * num2");
                break;

            case'c':
                    if( num2 != 0 )
                    System.out.println("%.2num1 / %.2num2");
                    else System.out.println("Error: Cannot divide by 0");


        }

    }

}
