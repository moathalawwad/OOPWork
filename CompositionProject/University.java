package universities;

import faculties.Faculty;

public class University
 {
    private String name;
    private String city;
    private boolean isPrivate;
    private Faculty f;
    public University(String name, String city, boolean isPrivate,String faculty_name, String dean_name, int staffNo)
	{
        this.name = name;
        this.city = city;
        this.isPrivate=isPrivate;
        this.f = new Faculty(faculty_name, dean_name, staffNo);
    }
    public University(String name, String city, boolean isPrivate)
    {
        this(name,city,isPrivate,null,null,0);
    }

    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public boolean isIsPrivate() {
        return isPrivate;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getFacultyName() {
        return f.getFaculty_name();
    }

    public String getDeanName() {
        return f.getDean_name();
    }

    public int getStaffNo() {
        return f.getStaffNo();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setFacultyName(String name) {
        f.setFaculty_name(name);
    }

    public void setDeanName(String dName) {
        f.setDean_name(dName);
    }

    public void setStaffNo(int newNo) {
       // staffNo=newNo;  error undefined var.
      // f.staffNo=newNo; error  staffNo has private access modifier
      // f.getStaff()=newNo; error ==> 20=newNo;
        f.setStaffNo(no);  //correct
    }

    public void printInfo() {
        System.out.println("University Name : " + this.name);
        System.out.println("University City : " + this.city);
        System.out.println("is Private : "+this.isPrivate);
        System.out.println("Faculty Info : ");
        f.printInfo();
        
   /*    or
        
        System.out.println("***Faculty Name*** "+f.getFaculty_name());
        System.out.println("***Dean Name*** "+f.getDean_name());
        System.out.println("***Staff Number*** "+f.getStaffNo());*/
        
    }

}
