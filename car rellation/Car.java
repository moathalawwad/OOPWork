package resources;

public class Car {
private String name ; 
private String color ; 
private int year ; 
private double price ;
private wheel w ;

public Car (String name , String color ,int year ,double price , double wheel_price , double wheel_weight , double wheel_redius ){
	this.name = name ; 
	this.color = color ; 
	this.year = year ; 
	this.price = price ; 
	w = new wheel (wheel_price , wheel_weight , wheel_redius );
}
public Car (String name , String color  ){
	this.name = name ; 
	this.color = color ; 
	
}
public Car (String name , String color ,int year ){
	this.name = name ; 
	this.color = color ; 
	this.year = year ; 
}
public void setname (String name ) {
	this.name = name ;
}
public void setcolor (String color ) {
	this.color = color ;
}
public void setyear (int year ) {
	this.year = year ;
}
public void setprice (double price ) {
	this.price = price ;
}

public String getname () {
	return name ;
}
public String getcolor () {
	return color ;
}
public int getyear () {
	return year ;
}
public double getprice () {
	return price ;
}

public void printInfo() {
	System.out.println ("name " +name);
	System.out.println ("color " + color);
	System.out.println ("year " + year);
	System.out.println ("price " + price);
	w.Display();
}

public void setwheel_redius(int wheel_redius ){
	w.setredius(wheel_redius);
}
public void setwheel_price(int wheel_price ){
	w.setprice(wheel_price);
}
public void wheel_weight(int wheel_weight ){
	w.setweight(wheel_weight);
}

public double getwheel_redius(){
	return w.getredius();
}
public double getwheel_price(){
	return w.getprice();
}
public double getwheel_weight(){
	return w.getweight();
}


public String compare (Car c) 
{
	if (this.getwheel_price() > c.getwheel_price())
	{
		return "name "+this.name;
	}
	if (this.getwheel_price() < c.getwheel_price())
	{
		return "name "+c.name;
	}
	else 
	return "no one they are the same ";
}
}




















