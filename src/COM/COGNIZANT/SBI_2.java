package COM.COGNIZANT;

import java.util.Scanner;

public class SBI_2 extends SBI_1{
public static void main(String[] args)
{
	SBI_2 s=new SBI_2();
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the name: ");
	String str=x.next();
	System.out.println("Enter the Address: ");
	String con=x.next();
	System.out.println("Salaried person(yes/no) ");
	String b=x.next();
	System.out.println("Select car or home loan ");
	String verify=x.next();
	System.out.println("Enter the amount ");
	int amount=x.nextInt();
	
	
	         String vehcle="car";
	         String details="sanctioned";
	
	  if(vehcle.equals(verify))
	  {
		  String caraccepts=s.carapproval(b,amount);
		  if(details.equals(caraccepts))
		  {
			  System.out.println("loan sanctioned");
			  System.out.println("Interest percentage : 12%");
			  System.out.println("Duration period for payment : 12 months");
			  s.Interest_car(amount);
			  
}
		  else
		  {
			  System.out.println("loan not sanctioned");
}
		  
}
	  else
	  {
		  String homeaccept=s.homeapproval(b, amount);
		  if(details.equals(homeaccept))
		  {
			  System.out.println("loan sanctioned");
			  System.out.println("Interest percentage : 8%");
			  System.out.println("Duration period for payment : 12 months");
			  s.Interest_Home(amount);
			  
}
		  else
		  {
			  System.out.println("loan not sanctioned");
}
}
		  
}
}

