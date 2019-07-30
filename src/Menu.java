import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("\n 1) Factorial \n 2) Prime \n 3) Fibonacci  ");
		int option = sc.nextInt();
		Factorial fact = new Factorial();
		Prime pr = new Prime();
		Fibonacci fibo = new Fibonacci();
		
	switch(option)
	{
case 1:
int m=fact.display();
System.out.println(m);
break;
case 2:
pr.display();
break;
case 3:
System.out.println("Fibonacci");
fibo.display();
break;
default:
	System.out.println("1 Factorial \\n2 Prime \\n3 Fibonacci");
	break;

	}

}
	}
}