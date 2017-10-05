package TestPackage;
public class OverLoadding {
	int b,a;
	void paliandrome(int a,int b){
		this.a=a;
		this.b=b;
		int x,result=0;
		while(a!=0){
			x = a%10;
			result= result*10+x;
			a = a/10;
			}
		if(result == b){
			System.out.println("OOOO yeah");
		}	
		else{
			System.out.println("Oops!!");
		}
	}
	
	void paliandrome(int b){
		this.b=b;
		int x,num,result=0;
		num=b;
		while(b!=0){
		x = b%10;
		result = result*10+x;
		b = b/10;		
		}
		if(num == result)
		{
			System.out.println("yeah Paliandrome");
		}
		else{
			System.out.println("Nope");
		}
	}
	
	public static void main(String args[]){
		OverLoadding obj = new OverLoadding();
		obj.paliandrome(1001);
		obj.paliandrome(545,545);
	}

}
