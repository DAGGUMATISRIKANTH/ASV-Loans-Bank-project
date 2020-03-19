package COM.COGNIZANT;

public class RBI {
 static String y="yes";
 static String n="no";
 static String value="sanctioned";
 String noamount="Not sanctioned";
 
 String homeapproval(String N,int amount)
 {
	 if(N.equals(y))
	 {
		 if(amount<=15000)
		 {
			 return value;
		 }
		 else
		 {
			 return noamount;
		 }
	 }
	 else if(N.equals(n))
	 {
		 if(amount<=50000)
		 {
			 return value;
		 }
		 else
		 {
			 return noamount;
		 }
	 }
	return N;
 }
 String carapproval(String N,int amount)
 {
	 if(N.equals(y))
	 {
		 if(amount<=10000)
		 {
			 return value;
		 }
		 else
		 {
			 return noamount;
		 }
		 
		 }
	 else if(N.equals(n))
			 { 
			 
		 if(amount<=50000)
		 {
			 return value;
		 }
		 else
		 {
			 return noamount;
		 }
	 }
	return N;
}
 
}


