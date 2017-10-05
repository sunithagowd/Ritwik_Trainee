package TestPackage;

import java.util.Scanner;

public class Problem {
	
/*void scaning(){
	
	
	
	
	int r;
int c=8;
	  Scanner scan=new Scanner(System.in);  
	int c = scan.nextInt();
System.out.println("testing");
	for(int i =0;i<11;i++){
		r = c *i;
		System.out.println(c +" "+" X "+ i+" = "+r);
		System.out.println("looping");
	}
	scan.close();
	
	
}*/
		
	public static void main(String args[]){
		
		int r;
		int rollno;
		System.out.println("give values");
		Scanner scan = new Scanner(System.in);
			  rollno=scan.nextInt(); 
		
			for(int i =0;i<11;i++){
				r = rollno *i;
				System.out.println(rollno +" "+" X "+ i+" = "+r);
				System.out.println("looping");
			}
			scan.close();
			
			
		}
		
		
		
		/*
		int rollno = 0 ;
        int result;
        Scanner scan = new Scanner(System.in);
        int  count=11;
               System.out.println("give values");
            boolean testing=false;
            if(testing==false){
                  rollno=scan.nextInt(); 
                 testing=true;
            }
               for(int i =1;i<count;i++){
               
                         
                   result = rollno *i;
                   System.out.println(rollno +" "+" X "+ i+" = "+result);
                   if (rollno == 0){
                          break;
                        }
                   
               }
           
                  scan.close();
	
	}
*/
	}

