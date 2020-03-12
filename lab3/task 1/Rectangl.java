class Rectangl{
	double length;
	double width ;
	String color ;

 Rectangl(double len , double wid ,String col ){
	  length = len; 
	  width = wid;
	  color = col;
	 
 }
 void CheckLength(){
	
	 
	 if(length>=100){
		 System.out.println("This rectangle have a long length");
		 
	 }
	     else{System.out.println("This rectangle does not have a long lengt");}
 }		
  void CheckWidth(){	 
    if(width>=100){
		System.out.println("This rectangle have a long width");
		 
	 }
	     else{System.out.println("This rectangle does not have a long width");}
 }
   double Area(){
	  
	   double a=length*width;
	   return a ;
	   
   }
   double Par (){
	  
	   double a = (2*length)+(2*width);
	   return a;
	   
   }
   boolean Size(){
	   if(Area()>=100){
		return  true;
	   }
	   else {
		return false;
		   
	   }
   }
}