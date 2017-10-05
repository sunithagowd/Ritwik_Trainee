package TestPackage;

public class SingleLChild extends SingleLParent{
	
	int bonus=10000;
	 public static void main(String args[]){
		 SingleLChild p=new SingleLChild();
	   System.out.println("Programmer salary is:"+p.salary);
	   System.out.println("Bonus of Programmer is:"+p.bonus);

}
}
