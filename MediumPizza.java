package TestPackage;

public class MediumPizza extends PizzaParent {
	void getPrize(){
		Cost = 30.0F;
		System.out.println(Cost);
	}
	void getName(){
		name = "Medium Pizza";
		System.out.println(name);
		
	}
public static void main(String args[]){
	MediumPizza MP = new MediumPizza();
	MP.getPrize();
	MP.getName();
		
	}

}
