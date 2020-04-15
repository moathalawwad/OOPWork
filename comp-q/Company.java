public class Company{
private String name;
private String city;
private Department dep;
private static int countC =0;

public  Company(String name , String city ,String dname ,int empnu){
	
	this.name=name;
	this.city=city;
	this.dep=new Department(dname,empnu);
	countC++;
	
	
	
	
	
}
public Company (String name ,String city ){
	
	this(name,city,"uknown",0);
	
	
}

public void SetDname(String dname){
	
	dep.SetName(dname);
}

 public String GetDname(){
	 return dep.Getname();
	 
	 
 }
 public void SetEmpNO (int Dnum){
	 
	 	 dep.SetempNO(Dnum);
 }
 public int GetEmpNO(){
	 return dep.GetempNO();
	 
	 
 }
public void SetName(String name){
	this.name=name;
	
	
	
	
}
public String Getname(){
	
	return name;
	
}

public void Setcity(String city){
	this.city=city;
	
	
	
	
}
public String Getcity(){
	
	return city;
	
}

  public void PrintInfo(){
		
		System.out.println("the name of company is "+Getname());
		System.out.println("the city that holds the company "+Getcity());
		dep.PrintI();
		
		
		
	}
  
	public boolean isitCAP (){
		
		if(city.equals("Amman"))
			return true;
		else
			return false;
		
	}
 public  void SetCounter(int countC){
	 this.countC=countC;
	 
	 
	 
 }
 public static int GetCount(){
	 
	 return countC;
 }
  
	public boolean SameEmp(Company m){
		
		if (this.GetEmpNO() == m.GetEmpNO())
			return true;
		else 
			return false;
		
		
	}
	
	
	
	
	
}