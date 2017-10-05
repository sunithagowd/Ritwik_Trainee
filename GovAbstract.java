package TestPackage;

public abstract class GovAbstract {
	int money=8;
	abstract void bus();
	abstract void train();
	abstract void flight();
	void president(){
		System.out.println("I am the P");
	}
	GovAbstract(){
		System.out.println("Gov");       
	}

}
