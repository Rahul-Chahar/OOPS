/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 09/01/2022
 */

package OOPS;

class Rectanglee
{
    public double length;
    public double breadth;

    public double area()
    {
        return length*breadth;
    }

    public double perimeter()
    {
        return 2*(length+breadth);
    }

    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }

}

public class RectangleTest1 {

    public static void main(String[] args) {
        Rectanglee r=new Rectanglee();
        r.length=10.5;
        r.breadth=5.5;

        System.out.println("Area"+r.area());
        System.out.println("perimeter"+r.perimeter());

        System.out.println("Is it a Square"+r.isSquare());
    }

}