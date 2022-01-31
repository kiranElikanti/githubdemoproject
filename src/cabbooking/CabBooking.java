package cabbooking;

public class CabBooking {
	
	public String TravellerName;
	public int busNumber;
	
	
	 public  CabBooking(String TravellerName, int busNumber) {
		 this.TravellerName=TravellerName;
		 this.busNumber=busNumber;
	 }
	     public String  bookTicket(String departure, String arrival){
	    	 return departure+","+arrival;
	    	 
	     }
	           void addNumbers(int a,int b) {
	        	   if(a!=b) {
	        	   System.out.println(a+","+b);
	        	   }else {
	        		   System.out.println("nuberes should not be equelled");
	        	   }
	           }
	        	   void enterValidNumber(int num) {
	        		   if(num>=18&&num<=99) {
	        			   System.out.println("valid number entered");
	        		   }else {
	        			   System.out.println("not valid number");
	        		   }
	           }
	        	   void deposit(int amount) {
	        		int   totalAmt;
	        		int bal=400;
	        		   if(amount >=500) {
	        		
	        			   System.out.println("enter amount"+amount);
	        			   
	        		   }else {
	        			   System.out.println("deposit amount should not be less than 500");
	        		   }
	        	   
	        	   totalAmt=bal+amount;
	        	   System.out.println(totalAmt);
}
                        void withdraw(int amount) {
                        	int totalBal;
                        	int balance=6000;
                        	if(amount>1000) {
                        		System.out.println(amount);
                        	}else {
                        		if(amount<=1000) {
                        			System.out.println("withdrawal amount should not exceed than 10000  ");
                        		}
                        	
                        	totalBal=balance-amount;
                        	System.out.println(totalBal);
                        
                        }
                        }
	           
	          public void display() {
	        	   System.out.println(TravellerName+" "+busNumber);
	           }

	public static void main(String[] args) {
		CabBooking c= new CabBooking("kiran",1);
		           c.display();
		     String c1=      c.bookTicket("srnagar","ameerpet");
		     System.out.println(c1);
		            c.addNumbers(5,5);
		            c.enterValidNumber(25);
		            c.deposit(600);
		            c.withdraw(5000);
		           
		            
		

	}

}
