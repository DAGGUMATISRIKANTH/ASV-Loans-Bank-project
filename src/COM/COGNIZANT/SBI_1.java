package COM.COGNIZANT;

public class SBI_1 extends RBI {
	public void Interest_car(int amount)
	{
		System.out.println("Interest amount for the car loan:" +  ((amount*12*2)/100));
	}
	
	public void Interest_Home(int amount)
	{
		System.out.println("Interest amount for the Home loan:" +  ((amount*12*2)/100));
	}
}
