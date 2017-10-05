package TestPackage;

public class Vehicles extends GovAbstract {
	int x ;
	Vehicles(int x){
		this.x =x;
		System.out.println(x + money);  
	}
   void bus()
   {
	   String S = "RTC";
	   System.out.println(S);
   }
   void train(){
	   String S = "Train";
	   System.out.println(S);
   }
   void flight(){
	   String S = "Aeroplane";
	   System.out.println(S);
   }
	public static void main(String[] args) {
		GovAbstract v = new Vehicles(2);
		v.bus();
		v.train();
		v.flight();
		v.president();

	}

}
