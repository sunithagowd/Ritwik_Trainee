package TestPackage;

public class BabyDog extends DogC {
	void weep(){
		System.out.println("weeping...");
	} 
	public static void main(String args[]){  
		
		BabyDog b;
		b= new BabyDog();
		b.eat();
		b.bark();
		b.weep();
	}

}
