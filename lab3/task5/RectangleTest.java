class RectangleTest {
  public static void main(String[]args){
	  Rectangle r1 =new Rectangle();
	  Rectangle r2 =new Rectangle(5,3,"black",false);
	  
	  System.out.println("length "+r1.length);
	  System.out.println("width "+r1.width);
	  System.out.println("color "+r1.color);
	  System.out.println("fill "+r1.fill);
	  
	  
	  System.out.println("length "+r2.length);
	  System.out.println("width "+r2.width);
	  System.out.println("color "+r2.color);
	  System.out.println("fill "+r2.fill);
     r1.color=r2.color;
	 r1.width=(r2.width+5);
	 System.out.println("color "+r1.color);
	  System.out.println("new width is  "+r1.width);
  
  
  }
  
 }