public class Circle {
    private  double radius=1.0;
    private String color="green";
    public Circle()
    {

    }
    public Circle(double radius,String color)
    {
        this.radius=radius;
        this.color=color;
    }
    public double getterRadius()
    {
        return this.radius;
    }
    public void setterRadius(double radius)
    {
        this.radius=radius;
    } public String getterColor()
    {
        return this.color;
    }
    public void setterColor(String color)
    {
        this.color=color;
    }
    public  double getArea()
    {
        return this.radius*this.radius*Math.PI;
    }
    public  double getPerimeter()
    {
        return 2*this.radius*Math.PI;
    }
    public String toString()
    {
        return "Circle has Radius= "
                +getterRadius()
                +" Color= "
                +getterColor()
                +" Area= "
                +getArea()
                +" Perimeter= "
                +getPerimeter()
                ;
    }
}
