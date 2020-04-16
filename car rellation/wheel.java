package resources;
public class wheel {
private double price , weight , redius ;

public wheel (double price , double weight , double redius )
{
	this.price = price ; 
	this.weight = weight ; 
	this.redius = redius ;
}

public void setredius (double redius ){
	this.redius = redius ;
}
public void setweight (double weight ){
	this.weight = weight ;
}
public void setprice (double price ){
	this.price = price ;
}


public double getredius (){
	return redius ;
}
public double getweight (){
	return weight ;
}
public double getprice (){
	return price;
}

public double Area () {
	return (redius * redius) *3.14 ;
}

public double perimeters () {
	return 2* redius *3.14 ;
}

public void Display () { 
 System.out.println ("redius  = " + this.redius); 
 System.out.println ("weight  = " + this.weight); 
 System.out.println ("wheel_price  = " + this.price); 
  System.out.println ("Area  = " + Area()); 
   System.out.println ("perimeters  = " + perimeters()); 
}



















}