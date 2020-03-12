class Regtangle{
	double length;
	double width;
	String color ;

 Regtangle(double l, double w, String c){
	 length=l;
	 width=w;
	 color=c;
	 
 }
  void Info(){
		System.out.println("the length of the reg is "+length);
		System.out.println("the width of the reg is "+width);
		System.out.println("the color of the reg is "+color);
	}
	void Check(){
		if(length>=100){
			System.out.println("the length is huge ");
			
			
		}
		else{System.out.println("the length is good size ");}
		
     if(width>=100){
			System.out.println("the width is huge ");
			
			
		}
		else{System.out.println("the width is good size ");}
		
		
	}
	double  Area(){
		double area = length*width;
		return area;
	}
}
