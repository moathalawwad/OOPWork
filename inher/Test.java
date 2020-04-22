public class Test{
  public static void main(String[]args){
		
		Point p =new Point(1,3);
		p.PrintInfo();
	  p.Sex(6);
		p.PrintInfo();
		
		Circle cc = new Circle(1,1,5);
		cc.PrintInfo();
		cc.Sex(3);
		p.PrintInfo();
		
		Cylindre c =new Cylindre(1,2,4,9);
			c.PrintInfo();
	}
}