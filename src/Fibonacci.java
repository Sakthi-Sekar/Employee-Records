import java.util.Scanner;

public class Fibonacci{  
	public void display() {
		Scanner s = new Scanner(System.in);  
	     System.out.print("Enter a number : ");  
	     int n = s.nextInt(); 
	     int n1=0,n2=1,n3,i;
	     System.out.print(n1+" "+n2);
	     for(i=2;i<n;++i)//loop starts from 2 because 0 and 1 are already printed    
	     {    
	      n3=n1+n2;    
	      System.out.print(" "+n3);    
	      n1=n2;    
	      n2=n3;    
	     } 
	     
	}
 
  
}