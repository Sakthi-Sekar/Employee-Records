import java.util.Scanner;

public class Prime {  
	public void display() {
		Scanner s = new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	       int n = s.nextInt();  
		 int temp=0;
  	   boolean isPrime=true;
    for(int count=2; count<n/2; count++)
    {
    	int num = 0;
		temp=num%count;
     if (temp==0) 
     {
  	   temp=1;
  	   isPrime=false;
  	   
       break;  
     
     }
    }
    if(isPrime) { 
    	System.out.println(n + " is not a prime number");
    }
    else {
  	  System.out.println(n + " is a prime number"); 
     }
    
		
	}
 


}  

