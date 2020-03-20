class TestRectangle{
  public static void main(String[]args){
	 
	  regctangle r1 =new regctangle();
		r1.PrintInfo();
		System.out.println("**********************************");
	  regctangle r2 = new regctangle(10,12,"red");
		r2.PrintInfo();
			System.out.println("**********************************");
		r2.SetColor("XXXXXXX");
		r2.PrintInfo();
			System.out.println("**********************************");
		r2.SetColor("green");
    r2.PrintInfo();		
			System.out.println("**********************************");
			r1.SetLenght(-10);
			r1.PrintInfo();
	}
}