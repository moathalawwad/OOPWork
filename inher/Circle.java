public class Circle extends Point{
private int rad;

public Circle (int x,int y,int rad){
super(x,y);
this.rad=rad;	
	
	
}
 
 public void setRad(int rad){
  this.rad=rad;	 
	 
 }
public int getRad(){
return rad;	
	
	
}
  public int getDmeter(){
		
		return 2*rad;
		
	}
	public double getCircum(){
		
		return 3.14*2*rad;
		
	}
	public double getArea(){
		
		
		return 3.14*(rad*rad);
		
		
	}
	
	public void PrintInfo(){
	 	
		super.PrintInfo();
		System.out.println("the rad is : "+getRad());
		System.out.println("the dmeter is : "+getDmeter());
		System.out.println("the Circumference is : "+getCircum());
		System.out.println("the area is : "+getArea());
		
	}
	
	
	
	
	
}