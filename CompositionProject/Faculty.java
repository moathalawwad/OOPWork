package faculties;
public class Faculty 
{
   private String faculty_name;
   private String dean_name;
   private int staffNo;
	
	
   public Faculty(String faculty_name, String dean_name, int staffNo) {
     this.faculty_name = faculty_name;
     this.dean_name = dean_name;
     this.staffNo = staffNo;
   }
	
   public String getFaculty_name(){   
      return faculty_name;   
	}
   public String getDean_name(){     
      return dean_name; 
	}
   public int getStaffNo() {   
      return staffNo;   
	}
   public void setFaculty_name(String faculty_name){      
      this.faculty_name = faculty_name; 
	}
   public void setDean_name(String dean_name) { 
      this.dean_name = dean_name;   
	}
   public void setStaffNo(int staffNo) {  
      this.staffNo = staffNo;  
	}
   public void printInfo(){
      System.out.println("Faculty Name : "+ this.faculty_name);
      System.out.println("Dean Name : "+ this.dean_name);
      System.out.println("Staff Number : "+ this.staffNo);
   }
}
