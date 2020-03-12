class TestCar{
	public static void main(String args[])
	{
		Car c1 =new Car(1000,1500,20);
		c1.printInfo();
		if(c1.isEconomy()==true){
			System.out.println("the car is economy !");
		}
		else {System.out.println("the car is not economy !");}
		
	}
}