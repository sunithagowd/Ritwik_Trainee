package TestPackage;

public class LargePizza extends PizzaParent{
	void getPrize(){
		Cost = 50.0F;
		System.out.println(Cost);
	}
	void getName(){
		name = "Large Pizza";
		System.out.println(name);
		
	}
	public static void main(String args[]){
		LargePizza LP = new LargePizza();
		LP.getPrize();
		LP.getName();
	}

}
