import java.util.Scanner;

public class n_number_sum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = inp.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.printf("Sum of first %d numbers is: %d", n, sum);
    }
}
