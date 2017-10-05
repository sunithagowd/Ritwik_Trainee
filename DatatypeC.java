package TestPackage;

public class DatatypeC {
	int x,num;
	String s;
	DatatypeC(){
		
	}
	DatatypeC(String s,int num){
		this.s = s;
		this.num = num;
	}
	void display1(){
		System.out.println(s +" "+ num);
		}
	void display(){
	System.out.println(x);
	}
	void Character(){
		char c = 'S';
		System.out.println(c);
		
	}


	public static void main(String args[]){
		DatatypeC obj = new DatatypeC();
		DatatypeC obj1 = new DatatypeC("Sun" ,970);
		obj.display();
		obj1.display1();
		obj.Character();
		float f = 10.5f;
		//int x = int(f);
		int i = 11;
        String str = Integer.toString(i);
		boolean b1 = true;
        boolean b2 = false;
        boolean b3 = (1 > 2)? b1:b2;
        if (11 == 11){
        	System.out.println("Yeah"+ f + b1 +" "+i);
        }
       
        
        System.out.println("Value of boolean variable b3 is :" + b3);    
	}
}
	

