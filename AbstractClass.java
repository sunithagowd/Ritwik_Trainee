package TestPackage;

 public abstract class AbstractClass {
	int i;

	AbstractClass(int ii){
		i=ii;
		System.out.println(i +"constructor");
		
	}
   abstract void save();
	abstract void save1();
	abstract void peace();
	void save2(){
		System.out.println("concreate method");
	}
	
	
	

}
