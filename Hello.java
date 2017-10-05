package TestPackage;

	class Hello extends OverRidding { //child class of sub class 2
		static int c;
		String s ="Itha";
		void add(int a,int b){
			c = a+b;
			super.you(); // accessed parent method
			System.out.println(super.s + s); //parent class variable
		//	System.out.println(c);
			}
		Hello(){ // parent class constructor
			super();
		}
	   public static void main(String args[]){  
	    Hello obj = new Hello();  
	    obj.add(222,10000);  
	  System.out.println(c);
	  obj.Even(6); //parent classes parent class method [Multi level Inheritance]
	//  obj.power(3,4);
	} 
	}

