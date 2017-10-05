package TestPackage;

 class OverRidding extends InProgram{ //child class2 
	int c,value;
	String s ="Sun";
	void add(int a,int b){
		c =a+b;
	}
	OverRidding(){
		System.out.println(value);
	}
	void you(){
		System.out.println("Me");
	}
	public static void main(String args[]){
		OverRidding ob = new OverRidding(); 
		ob.add(25, 3);
		ob.Even(3); //parent class method called with obj of child class[Heirarchial]
	}
}

