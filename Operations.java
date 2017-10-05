package TestPackage;

public class Operations {
	int x,y, z;
	float w;
	Operations(int i,int n){
		 x = i+n;
		if(i>n){
			y = i-n;
		}
		else{
			 y = n-i;
		}
		 z = i*n;
		 w = i/n;
	}
    void display(){
    	System.out.println("Sum of 2 num"+"="+ x);
    	System.out.println("Sub of 2 num"+"="+ y);
    	System.out.println("Mul of 2 num"+"="+ z);
    	System.out.println("Div of 2 num"+"="+ w);
    	
    }
	public static void main(String args[])
	{
		Operations obj = new Operations(25,1000);
		obj.display();
	}
}
