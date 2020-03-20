
package myshapes;
 public class Circle{
	private double radius;
	private String color;
	boolean fill;
	
 public	Circle(){ //default constactor 
		radius=1.0;
		color="without color";
		fill=false;
		
		
		
	}
	
	public Circle(double r, String c , boolean f){
		
		radius=r;
		color=c;
		fill=f;
		
		
	}
	 //change radius
	public void SetRadius(double newv){
		if(newv>0 && newv<=100){
			
				radius=newv;
		}
	
		else{
			System.out.println("your new value is invalid please recheck");
		}
		
	}
	//return radius
 public double GetRadius(){
		
		
		return radius;
	}
	//chage color 
	public void SetColor(String newc){
		if(newc.equals("Red") || newc.equals("black")){
			color=newc;
		}
		else{
			System.out.println("your new color is invalid please recheck");
		}
		
	}
  public String GetColor(){
		
		return color;
		
	}
	
	
}