package vehicle;
public class Car {
	private String Carname;
	private String Carcolor;
	private double Carprice;
public Car(){
	
}
 public Car(String Carname , String Carcolor,double Carprice){
	this.Carname=Carname;
	this.Carcolor=Carcolor;
	this.Carprice=Carprice;
	
	
}
public Car(String Carname, String Carcolor){
	this(Carname,Carcolor,0.0);
	
	
}
public Car(String Carname, double Carprice){
	this(Carname,"uknown",Carprice);
	
	
}
public void CarNSet(String Carname){
	this.Carname=Carname;

}
public void PrintInfo(){
	
	System.out.println("the car name is "+Carname);
	System.out.println("the car color is "+Carcolor);
	System.out.println("the car Price is "+Carprice);
	
}
public String CarNGet(){
	return Carname;
}
public void CarCSet(String Carcolor){
	this.Carcolor=Carcolor;
}
 public  String CarCGet(){
	return Carcolor;
}
 public void CarPSet(double Carprice){
	
   if (Carprice>0){
		 
		 this.Carprice=Carprice;
	 }
	 else{System.out.println("Car Price are invalid re check!"+Carprice);}
 }
	 public double CarPGet(){
		 
		 return Carprice;
		 
	 }
	 public String Compare (Car cc){
		 
		 if(this.Carprice > cc.Carprice){
			 return (this.Carname +" have highest price   : "+this.Carprice);
		 }
			 else if (this.Carprice<cc.Carprice){
				return (cc.Carname +" price is  : "+cc.Carprice);
				
				 
			 }
			 else {
				 return ("the cars have the same price ");
			 }
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
