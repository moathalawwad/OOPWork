public class Company {

private String name;
private String city;
private int employees;
static int countcompany=0 ;
 
 public  Company(String name ,String city ,int employees){
    this.name =name;
		this.city=city;
		this.employees=employees;
     countcompany++;
    


	 
  }
 public  Company(String name ,String city){
  this(name,city,0);	 
 }

  public  Company(String name,int employees){
   this(name,"no city",employees)	 ;
 }
 public  Company(int employees){
	 this("no name ","no city",employees);
	 
 }
 
  public  Company(String name){
		this(name,"no city yet",0);
	 
 }
 public void SetName(String name){
	 this.name=name;
	  
	 
 }
 public String GetName(){
 return name;
 }
 public void SetCity(String CName){
	 String citis []={"Amman", "Irbid", "AsSalt", "Aqaba", "Zarqa", "Jerash"};
	 boolean c = false;
	 for(int i =0;i<citis.length;i++){
		 if(CName.equals(i)){
			 city=CName;
		    c=true;
	        break;
	 }
	 }
	  if(c==false){
			CName="Erorr city";
			
		}
 }
		public String GetCity(){
			return city;
		}
		public void SetEmpNo(int employees){
			if(employees>5){
				
				this.employees=employees;
			}
			else{System.out.println("invalid number ERROR!");}
			
			
		}
		public int GetEmpNo(){
			return employees;
		}
		public static void SetComC(int count){
			count=countcompany;
			
			
		}
		public static int GetCoNo (){
			return countcompany;
			
		}
		public void PrintInfo(){
			System.out.println("the name is "+GetName());
			System.out.println("City is "+GetCity());
			System.out.println("Emp number is "+GetEmpNo());
			
		}
		 public boolean IsItCap(){
			 if(city.equals("Amman"))
				 return true;
			 else 
				 return false;
		 }
  public boolean SameEmpNo(int employees){
		this.employees=employees;
		if(employees==employees)
			return true;
		else
			return false;
		
		
		
	}
 
 
 
}