package TestPackage;

public class Lastdigit {
     int a,b,c;
     boolean test = false;
     int result;
	public boolean lastDigit(int a, int b, int c,int result) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.result=result;
		 if(a%10 == b%10 ){
		
				 test=  true;
				 System.out.println(test);	
				 System.out.println("sucess");
				 
			 return test;
		
	
		       
		  }
		 else if(b%10 == c%10){
		       return true;
		    
		  }
		  else if(a%10 == c%10){
		    return true;
		  }
		 
		 else{
				 test=  false;
				 System.out.println(test);	
				 System.out.println("failur");
				       return false;
		  }
		 
		 
		 
		 
		       
		}
	
	public static void main(String args[]){
		Lastdigit obj = new Lastdigit();
		obj.lastDigit(23, 13, 1,0);
		System.out.println();
	}	
}
