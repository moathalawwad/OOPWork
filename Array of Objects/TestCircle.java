package test;
import java.util.Scanner;
import shapes.Circle;
public class TestCircle {
    public static void main(String[] args) 
    {
        // Declare an array of Circle data type with size 4.
       Circle circleArray[ ]= new Circle[4];
       double r;
       String c;
       Scanner scan = new Scanner(System.in);
        for(int i=0;i<circleArray.length;i++)
        {
            System.out.println("Enter the radius of circle  "+(i+1));
            r=scan.nextDouble();
            System.out.println("Enter the color of circle  "+(i+1));
            c= scan.next();
            // Create an object of type circle in each cell
            circleArray[i]=new Circle(r,c);
        }
        
           // Print the information of all  the circles (I need a loop)
          for(int i=0;i<circleArray.length;i++)
        {
            System.out.println("Information of circle "+(i+1));
            circleArray[i].printInfo();
        }
        // Change the color of the fourth circle to Green color.
          circleArray[3].setColor("Green");
          // Print the information of the fourth circle only.
          circleArray[3].printInfo();
		  // find the sum of the radius of all circles in the array
		  double sum=0.0;
		  for(int i=0;i<circleArray.length;i++)
		    sum=sum+circleArray[i].getRadius();
	      System.out.println("The sum of the radius of all circles is "+ sum);
     }
  }
