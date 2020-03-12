class RectanglTest{
	public static void main (String[]args){
		Rectangl rr = new Rectangl(200,100,"red");
		
		
		System.out.println("length : "+rr.length);
		System.out.println("width : "+rr.width);
		System.out.println("color : "+rr.color);
		rr.CheckLength();
		rr.CheckWidth();
		double area =rr.Area();
		double par =rr.Par();
		System.out.println("area"+area);
		System.out.println("par"+par);
		if(rr.Size()==true){
			System.out.println("it have big area");
			
		}
		else {System.out.println("it does not have big area");}

}
}