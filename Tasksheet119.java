import java.util.*;

public class Tasksheet119 {
    public static double additions(double num1, double num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        
        double addsum = additions(num1,num2);

        System.out.println(" "+ addsum);
        scan.close();
    }
}
