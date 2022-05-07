import java.util.Scanner;  

public class main {

	public static void main (String args[])
	{
	
	
	Scanner sc = new Scanner(System.in);
	
	 System.out.println("enter p:");
	 
	 float p = sc.nextFloat();
	 
	 System.out.println("enter r:");
	 
	 float r = sc.nextFloat();
	 
	 System.out.println("enter t:");
	 
	 float t = sc.nextFloat();
	 
	 System.out.println("enter n:");
	 
	 float n = sc.nextFloat();
    
     float si  = (p*r*t)/100;   
   System.out.println("Simple Interest is: " +si);  
	

   
	double amount  = p * Math.pow(1 + (r / n), n * t);
	
	double ci = amount - p;
	
	  System.out.println("Compound Interest after " + t + " years: "+ci);
	  
	double average = (ci + si + p + r + t )/5 ;
	
	  System.out.println("Average of five numbers ci, si, p, r and t is " + average );

	}	
}
