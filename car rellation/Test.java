import resources.Car;
import java.util.Scanner;

public class Test {
public static void main (String args[]){
Scanner input = new Scanner (System.in); 
Car myCars[] = new Car[3];
for (int index = 0 ; index < myCars.length ; index++){
	System.out.print("Enter the name for car : "+(index+1));
	String n = input.next();
	System.out.print("Enter the color for car : "+(index+1));
	String c = input.next();
	System.out.print("Enter the year for car : "+(index+1));
	int y = input.nextInt();
	System.out.print("Enter the price for car : "+(index+1));
	double p = input.nextDouble();
	System.out.print("Enter the wheel_price for car : "+(index+1));
	double wp = input.nextDouble();
	System.out.print("Enter the wheel_weight for car : "+(index+1));
	double ww = input.nextDouble();
	System.out.print("Enter the wheel_redius for car : "+(index+1));
	double wr = input.nextDouble();
	 myCars[index] = new Car (n,c ,y , p,wp,ww,wr);
}
System.out.println("***************************");
myCars[1].printInfo();
	  System.out.println("***************************");
myCars[0].setwheel_redius(30);
System.out.println("after updting ");
myCars[0].printInfo();
System.out.println("***************************");
for (int index = 0 ; index < myCars.length ; index++){
  if (myCars[index].getwheel_price() > 200)
  {
	  System.out.println("name of the cars "+myCars[index].getname());
  }
}
System.out.println("***************************");
}
}