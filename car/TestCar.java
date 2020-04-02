import vehicle.Car;
public class TestCar {
  public static void main(String[]args){
		Car c1 = new Car("Ford","blue",10000);
		c1.PrintInfo();
		Car c2 = new Car("toyota","red",2500);
		c2.PrintInfo();
		System.out.println(c1.Compare(c2));
			c1.CarPSet(30000);
		c1.PrintInfo();
		c1.CarPSet(0);
			c1.PrintInfo();
	}
	
	}