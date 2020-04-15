package shapes;
public class Circle
{
    private double radius;
    private String color;
    public Circle()
    {
        radius = 1;
        color="No Color";
    }
    public Circle(double r,String c)
    {
        setRadius(r);   color=c;
    }
    // setters
    public void setRadius(double r)
    {
        if(r>0)
        {
            radius=r;
        }
        else
        {
            System.out.println("error , invalid data");
            radius =1;
        }
    }
    public void setColor(String c)
    {
        color=c;
    }
    // getters
    public double getRadius()
    {
        return radius;
    }
    public String getColor()
    {
        return color;
    }
    public double getArea()
    {
        return radius*radius*Math.PI;
    }
    public void printInfo()
    {
        System.out.println("Radius : "+radius+", Color : "+color+", Area : "+getArea());
    }
}
