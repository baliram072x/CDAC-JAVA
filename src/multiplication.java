
import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter 2 numbers for multiplication");
        double num1 = sc.nextDouble();
        double num2  = sc.nextDouble();
        // System.out.println("multiplication of" + num1 + num2 + " is " + num1*num2);

        System.out.println("result = " + (num1 * num2));
    }
}
