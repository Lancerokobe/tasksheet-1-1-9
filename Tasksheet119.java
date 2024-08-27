import java.util.*;

public class Tasksheet119 {
    public static double additions(double num1, double num2){
        return num1+num2;
    }

    public static double multiplication(double num1, double num2){
        return num1*num2;
    }

    public static double divisions(double num1, double num2){
        return num1/num2;
    }

    public static double subtractions(double num1, double num2){
        return num1-num2;
    }

    public static void main(String[] args) {
        double num1, num2, addsum, mulsum, divsum, subsum;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        
        addsum = additions(num1,num2);
        mulsum = multiplication(num1,num2);
        divsum = divisions(num1,num2);
        subsum = subtractions(num1,num2);

        System.out.println();
        System.out.println("The sum is: "+ addsum);
        System.out.println("The product is: "+ mulsum);
        System.out.println("The quotient is: "+ divsum);
        System.out.println("The difference is: "+ subsum);
        scan.close();
    }
}
