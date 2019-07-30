import java.util.Scanner;

public class Factorial {
public int display() {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    int result = 1;
    for (int i = 1; i <= n; i++) {
        result = result * i;
    }
    return result;
	}
}
