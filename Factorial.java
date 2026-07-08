 import java.util.*;
 
 class Factorial
 {
	 public static void main(String args[])
	 {
		 Scanner in = new Scanner(System.in);
		 int n, i, fact=1;
		 
		 System.out.print("Enter an integer: ");
		 n = in.nextInt();
		 
		 for(i=n ; i>1 ; i--)
			 fact*=i;
		 
		 System.out.println(n+"! = "+fact);
	 }
 }