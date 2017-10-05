package TestPackage;

public class SmallPizza extends PizzaParent {
	void getPrize(){
		Cost = 10.0F;
		System.out.println(Cost);
	}
	void getName(){
		name = "Small Pizza";
		System.out.println(name);
		
	}
public static void main(String args[]){
	SmallPizza SP = new SmallPizza();
	SP.getPrize();
	SP.getName();
		
	}
}
