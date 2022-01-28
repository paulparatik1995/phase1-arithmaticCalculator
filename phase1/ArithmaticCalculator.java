package phase1;
import java.util.*;
public class ArithmaticCalculator {

	public static void main(String[] args) {
	
		char c1;
		double n1,n2,n3;
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter operation: +, -, *, / ");
		  c1 = sc.next().charAt(0);
		
		
		 System.out.println("Enter First Number");
		  n1=sc.nextInt();
		 
		 System.out.println("Enter Second Number");
		 n2=sc.nextInt();
		 
	
		 
		 switch (c1) {
		case '+':
			
		 n3 = n1+n2; 
		 System.out.println("Result= " + n3);
		 break;
		 
		case '-':
			 n3=n1-n2;
			 System.out.println("Result= "+n3);
			 break;
			
		case '*':
			n3=n1*n2;
			System.out.println("Result= "+n3);
			break;
			
		case '/':
			n3=n1/n2;
			System.out.println("Result= "+n3);
			break;
			
		default: System.out.println("Operation not Possible");
			break;
		}
		 
		 sc.close();
		 
	}
	
	

}
