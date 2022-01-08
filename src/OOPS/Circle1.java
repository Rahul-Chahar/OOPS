/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 08/01/2022
 */

package OOPS;

import java.net.SocketOption;

class Circle2
        {
           private   double radius;
           public double getRadius()
           {
               return radius;
           }
           public double setRadius()
           {
               return radius;
           }
           public void setRadius(double r)
           {
               radius = r;
           }
           public double area()
           {
               return Math.PI*radius*radius;
           }
           public double perimeter()
           {
               return 2*Math.PI*radius;
           }
           public double circumference()
           {
               return perimeter();
           }
        }

public class Circle1 {
    public static void main(String [] args)
    {
        Circle2 c2 = new Circle2();
        Circle2 c3 = new Circle2();
        c2.setRadius(11);
        c3.setRadius(18);

        System.out.println(c2.area());
        System.out.println(c2.perimeter());
        System.out.println(c2.circumference());

        System.out.println(c3.area());
        System.out.println(c3.perimeter());
        System.out.println(c3.circumference());

        System.out.println("radius"+c2.getRadius());
        System.out.println("radius"+c3.getRadius());

    }


    }

