//Data Hiding
package OOPS;
class RectangleTest
{
    private double length; //yha hamne public ki jagha private kar diya hai isliye ab ham length koh direct Access nahi kar skte.
    private double breadth; //agar hame inki value access karni hai toh ham use karte hai get and set.

    public double getLength() //ye get read kare ke kaam aata hai.
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }
    public void setLength(double l)  //ye set write karen ke kaam aata hai.
    {
        length = l;
    }
    public void setBreadth(double b)
    {
        breadth = b;
    }
    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length*breadth);
    }
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }
}
public class Rectangle {
    public static void main(String [] args)
    {
        RectangleTest r =new RectangleTest();
        r.setLength(10.5);
        r.setBreadth(5.5);

        System.out.println("Area"+ r.area());
        System.out.println("Perimeter"+r.perimeter());
        System.out.println("Is it a square :"+r.isSquare());

        System.out.println("Length"+r.getLength());
        System.out.println("Breadth"+r.getBreadth());

    }
}
