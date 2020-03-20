import myshapes.Circle;
class TestCircle{
  public static void main(String[]args){
	 
	 Circle c1 =new Circle();
	 System.out.println("RAdius of the first is "+c1.GetRadius());
	  c1.SetRadius(7.5);
	 System.out.println("RAdius of the first is "+c1.GetRadius());
	 c1.SetRadius(-10);
		System.out.println("RAdius of the first is "+c1.GetRadius());
		
		c1.SetColor("XXXX");
			System.out.println("RAdius of the first is "+c1.GetColor());
		
	}



}