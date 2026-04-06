import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2 : ");
        int num2 = sc.nextInt();

        int sum = sum(num1, num2);
        System.out.println("The final sum is: " + sum);
    }

    public static Integer sum(int num1, int num2) {
        return num1 + num2;
    }
}