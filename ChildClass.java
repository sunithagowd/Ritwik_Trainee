package TestPackage;

public class ChildClass extends InProgram{ //child class 1
	void power(int n,int x){
		super.cool(); //parent class method used
		
		System.out.println(Math.pow(n,x) + " "+super.t);	
				
	}
	public static void main(String args[]){
		ChildClass obj = new ChildClass();
		obj.power(5,2);
		obj.Even(5005);//parent class method called with obj of child class[heirarchial In]
	}

}
