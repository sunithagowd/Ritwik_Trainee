package TestPackage;

import java.util.Scanner;

public class ChildMultipleIn implements MultipleIn1,MultipleIn2 {

	@Override
	public void pattern() {
		int x=4;
		for(int i=1;i<x;i++){
			for(int j=1;j<i;j++){				
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
	}

	@Override
	public int fib(int n) {
		if ( n == 0 )
		      return 0;
		   else if ( n == 1 )
		      return 1;
		   else
		      return ( fib(n-1) + fib(n-2) );	
		
	}
	public void hello(){
		System.out.println("I hv done Multiple Inheritanve using Interface");
	}

	public void positivernegative() {
		int x=202,result=0;
		if(x < 0){
			System.out.println("Negative");
		}
		else{
			System.out.println("Positive");
			result = result*10+x;
		}
		
		
	}
	public static void main(String []args){
		ChildMultipleIn sun = new ChildMultipleIn();
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		sun.pattern();
		System.out.println(sun.fib(x));
		sun.positivernegative();
		sun.hello();
		System.out.println("I am taken from interface and my value= "+dozen);
	}       
	

}
