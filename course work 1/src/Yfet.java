import java.util.Scanner;

public class Yfet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner result= new Scanner(System.in);
		double OOP,WEBDESIGN,COMPUTERAPLLICATION,COMPUTERSYSTEMS,COMMUNICATIONSKILLS,ENT,MATHS,PROBLEMSOLVING,TOTAL,AVERAGE;
		System.out.println("Enter your OOP marks" +"");
		OOP=result.nextDouble();
		while(OOP<0||OOP>100){
		     System.out.println("You Entered the wrong number , Enter The number Again :");
		     OOP = result.nextInt();
		}
		System.out.println("Enter your WEB DESIGN marks" +"");
		WEBDESIGN=result.nextDouble();
		while(WEBDESIGN<0||WEBDESIGN>100){
		     System.out.println("You Entered the wrong number , Enter The number Again :");
		     WEBDESIGN = result.nextInt();
		}
		System.out.println("Enter your COMPUTER APPLICATION marks" +"");
		COMPUTERAPLLICATION	=result.nextDouble();
		while(COMPUTERAPLLICATION<0||COMPUTERAPLLICATION>100){
		     System.out.println("You Entered the wrong number , Enter The number Again :");
		     COMPUTERAPLLICATION = result.nextInt();
		}
		System.out.println("Enter your COMPUTER SYSTEMS marks" +"");
		COMPUTERSYSTEMS=result.nextDouble();
		while(COMPUTERSYSTEMS<0||COMPUTERSYSTEMS>100){
		     System.out.println("You Entered the wrong number , Enter The number Again :");
		     COMPUTERSYSTEMS = result.nextInt();
		}
		
		System.out.println("Enter your COMMUNNICATION SKILLS marks" +"");
		COMMUNICATIONSKILLS=result.nextDouble();
		while(COMMUNICATIONSKILLS<0||COMMUNICATIONSKILLS>100){
		     System.out.println("You Entered the wrong number , Enter The number Again :");
		     COMMUNICATIONSKILLS = result.nextInt();
		}
		System.out.println("Enter your ENT marks" +"");
		ENT=result.nextDouble();
		while(ENT<0||ENT>100){
		     System.out.println("You Entered the wrong number , Enter The number Again :");
		     ENT = result.nextInt();
		}
		System.out.println("Enter your MATHS marks" +"");
		MATHS=result.nextDouble();
		while(MATHS<0||MATHS>100){
		     System.out.println("You Entered the wrong number , Enter The number Again :");
		     MATHS = result.nextInt();
		}
		System.out.println("Enter your PROBLEM SOLVING marks" +"");
		PROBLEMSOLVING=result.nextDouble();
		while(PROBLEMSOLVING<0||PROBLEMSOLVING>100){
		     System.out.println("You Entered the wrong number , Enter The number Again :");
		     PROBLEMSOLVING = result.nextInt();
		}
		TOTAL=OOP+WEBDESIGN+COMPUTERAPLLICATION+COMPUTERSYSTEMS+COMMUNICATIONSKILLS+ENT+MATHS+PROBLEMSOLVING;
		System.out.println("Total="+ TOTAL);
		AVERAGE=TOTAL/8;
		System.out.println("AVERAGE="+ AVERAGE);
		
	
		if(AVERAGE>=80 && AVERAGE<100) {
			System.out.println("GPA=" +5.0);
		} else if(AVERAGE>=75 && AVERAGE<80) {
			System.out.println("GPA="+4.5);
			
		} 
		 else if(AVERAGE>100) {
				System.out.println("GPA=" +"INVALID INPUT");
				}
		 else if(AVERAGE>=70 && AVERAGE<75) {
			System.out.println("GPA="+4.0);
		}else if(AVERAGE>65 && AVERAGE<70) {
			System.out.println("GPA="+3.5);}
		else if(AVERAGE>=60 && AVERAGE<65) {
			System.out.println("GPA="+3.0);
		}else if(AVERAGE>=55 && AVERAGE<60) {
			System.out.println("GPA="+2.5);
		}else if(AVERAGE>=50 && AVERAGE<55) {
			System.out.println("GPA="+2.0);
		}else if(AVERAGE>=45 && AVERAGE<50) {
			System.out.println("GPA="+1.5);
		}else if(AVERAGE>=40 && AVERAGE<45) {
			System.out.println("GPA="+1.0);
		}
			else if(AVERAGE>=35 && AVERAGE<40) {
				System.out.println("GPA="+0.5);
			}else if(AVERAGE>=30 && AVERAGE<35) {
				System.out.println("GPA="+0.4);
			}else if(AVERAGE>=25 && AVERAGE<30) {
				System.out.println("GPA="+0.3);
			}else if(AVERAGE>=20 && AVERAGE<25) {
				System.out.println("GPA="+0.2);
			}else if(AVERAGE>=1 && AVERAGE<20) {
				System.out.println("GPA="+0.1);
			}
		else{
			System.out.println("GPA="+0.0);
		}
			
		}
}
	
		
		
		

	


