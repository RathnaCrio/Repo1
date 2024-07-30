import java.util.Scanner;

public class LargestSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();

        double largest = Math.max(x, Math.max(y, z));
        System.out.println("The sum of the largest number is " + largest);
    }
}