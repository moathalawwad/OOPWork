public class Department{
private String name;
private int empno;


public Department(String name ,int empno){
	this.name=name;
	this.empno=empno;
	
	
	
	
}

public void SetName(String name){
	this.name=name;
	
	
	
	
}
public String Getname(){
	
	return name;
	
}

public void SetempNO(int empno){
	this.empno=empno;
	
	
	
	
}
public int GetempNO(){
	
	return empno;
	
}

public void PrintI(){
	
	System.out.println("the name of the dep is "+Getname());
	System.out.println("the number of employees is "+GetempNO());
	
	
}

}