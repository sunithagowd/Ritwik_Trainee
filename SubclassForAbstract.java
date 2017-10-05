package TestPackage;

public class SubclassForAbstract extends AbstractClass {

	
	 SubclassForAbstract(int ii) {
		super(ii);
		// TODO Auto-generated constructor stub
	}
	void save(){
		 System.out.println("implemented save method");
	 }
	 void save1(){
		 System.out.println("implemented save method");
		
	 }
	 void peace(){
		 System.out.println("implemented save method");
	 }
	
	public static void main(String[] args) {

		AbstractClass a=new SubclassForAbstract(1);
		
		a.peace();
		a.save2();
}
}
