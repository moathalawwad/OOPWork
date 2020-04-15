import java.util.Scanner;
public class TestComp{
public static void main(String[]args){
	String n,c,dn,nn,cc,ddn;	
	int empn,empnn;
	
	
	System.out.println("opict created "+Company.GetCount());
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the name of the company  ");
            n= scan.next();
						
	System.out.println("Enter the name  of the city   ");
            c= scan.next();					
	
	System.out.println("Enter the deparment name   ");
            dn= scan.next();
						
	System.out.println("Enter the employee number   ");
            empn= scan.nextInt();
  					
	Company c1 =new Company(n,c,dn,empn);
		
		c1.PrintInfo();
		c1.SetDname("New");
		c1.PrintInfo();
		
		
			System.out.println("is it in the capetal? "+c1.isitCAP());
			
			
			System.out.println("Enter the name of the company  ");
            nn= scan.next();
	System.out.println("Enter the name  of the city   ");
            cc= scan.next();					
	
	System.out.println("Enter the deparment name   ");
            ddn= scan.next();
	System.out.println("Enter the employee number   ");
            empnn= scan.nextInt();
  					
	Company c2 =new Company(nn,cc,ddn,empnn);	
	System.out.println("dose "+c1.Getname()+" they have the same employees  number as "+c2.Getname()+" "+ c1.SameEmp(c2));
	
	c2.GetDname();
	System.out.println("opict created "+Company.GetCount());
}
}