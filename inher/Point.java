 public class Point {
	private  int x;
	private int y;

 public Point(int x,int y){
	 this.x=x;
	 this.y=y;
	 
	 
 }
 public Point (int x){
	 
	 this(x,0);
 }
 public void Sex (int x){
   this.x=x;	 
	 
	 
 }
 public void Sey (int y){
	this.y=y; 
	 
 }
 public int Gex (){
   return x;	 
	 
	 
 }
 public int Gey(){
   return y;	 
	 
 }
 
 public void PrintInfo(){
	 
	 System.out.println("X value is : "+Gex());
	 System.out.println("y value is : "+Gey());
	 
	 
 }
 
 
 
 
 
}