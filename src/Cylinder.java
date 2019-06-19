public class Cylinder extends Circle{
    private double height =1.0;
    public Cylinder()
    {

    }
    public Cylinder(double height)
    {
        this.height =height;
    }
    public Cylinder(double height, double radius,String color)
    {
        super(radius,color);
        this.height =height;
    }
    public  double getHeight()
    {
        return this.height;
    }
    public void setHeight(double height)
    {
        this.height =height;
    }
    public double getVolume()
    {
        return super.getArea()*this.getHeight();
    }
    public String toString()
    {
        return "Cylinder has heigth= "
                +getHeight()
                +" Volume = "
                +getVolume()
                +super.toString()
                ;
    }

}
