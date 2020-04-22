public class Cylindre extends Circle {
	private int high;

public Cylindre(int x ,int y ,int rad , int high){
super(x,y,rad);
this.high=high;
}

public Cylindre(int y ,int rad,int high){
this(0,y,rad,high);	
	
}
public void setHigh(int high){
	this.high=high;
	
	
}
public int getHigh(){
	
	return high;
	
}
// override
public double getArea(){
	
	return ((2*3.14)*(getRad()*getRad()))+(3.14*2*getRad());
	
}

public double getVolume (){
	
	return (3.14*(getRad()*getRad()))*high;
	
}

 public void PrinInfo(){
	 
	 super.PrintInfo();
	 System.out.println("the volume is : "+getVolume());
	 
	 
	 
 }





}