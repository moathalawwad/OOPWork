import java.util.Scanner;
public class Test{
  public static void main (String[]args){
			Scanner scan = new Scanner (System.in);
		Company c1 =new Company ("AI Factor","Amman",40) ;
		
		System.out.println("com counter is "+Company.GetCoNo());
	 String cn = scan.nextLine();
	 String cc = scan.nextLine();
	 int empnum = scan.nextInt();
		
		Company c2 = new Company(cn,cc,empnum);
		c2.PrintInfo();
		System.out.println("moath");
		
		c2.SetCity("Amman");
		c2.SetEmpNo(122);
		c2.PrintInfo();
	
	System.out.println("the comp in amman "+c2.IsItCap());
	
		 String c333 = scan.nextLine();
	 String cc3 = scan.nextLine();
	 int empnum3 = scan.nextInt();
	Company c3 = new Company(c333,cc3,empnum3);
	 System.out.println("is it same number ?");
	 System.out.println("com counter is "+Company.GetCoNo());
	 
	}

}