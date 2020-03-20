class regctangle {
 	private double length;
	private double width;
	private String fillcolor;
	
	
	regctangle(){
		
		length=1;
		width=1;
		fillcolor="undefined";
		
		
	}
	regctangle(double l, double w, String f){
		
		length=l;
		width=w;
		fillcolor=f;
		
		
		
	}
   void SetLenght(double newl){
		 if(newl>0){
			 length=newl;
			 
		 }
		 else{ System.out.println("ERROR "+newl+" is not a valid length !!");}
	
		  
	 }
 
   double GetLength(){
		 
		 return length;
	 }
	 
	 
   void SetWidth(double neww){
		 if(neww>0){
			 width=neww;
			 
		 }
		 else{System.out.println("ERROR "+neww+" is not a valid width !!");}
	
		  
	 }
 
   double GetWidth(){
		 
		 return width;
	 }
   
	    void SetColor(String newc){
		 if(newc.equals("red") || newc.equals("green") ||newc.equals("black") ||newc.equals("yellow") ||newc.equals("orange") ||newc.equals("blue") ||newc.equals("white") ||newc.equals("purple")){
			fillcolor=newc;
			 
		 }
		 else{System.out.println("ERROR "+newc+" is not a valid Color !!");}
	
		  
	 }
 
   String GetColor(){
		 
		 return fillcolor;
	 }
  double GetArea(){
		 double area=length*width;
		 return area;
		 
		 
	 }
	 double GetPerimete(){
		 double perimeter=2*(width+length);
		 return perimeter;
		 
	 }
	 String IsBig(){
		 if(GetArea()>=200){
			 String big ="Its a big regctangle";
			 return big;
			 
		 }
		 else{
			 String notbig ="its not a big regctangle";
			 return notbig;
		 }
	 }
	 void PrintInfo(){
		 System.out.println("regctangle length "+length);
		 System.out.println("regctangle width "+width);
		 System.out.println("the color filling the regctangle is "+fillcolor);
		 System.out.println("the area is "+GetArea());
		 System.out.println("the perimeter is "+GetPerimete());
		 System.out.println("the size of ur regctangle is "+IsBig());
		 
		 
	 }

}