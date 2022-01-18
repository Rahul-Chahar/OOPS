/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 19/01/2022
 */

package Scratch;
class Rectangle{
    int length;
    int breadth;
    int x = 10;
    Rectangle(int length , int breadth )
    {
       this.length = length;
       this.breadth = breadth;
    }
}
class Cuboid extends Rectangle {
    int height;
    int x = 20;
    Cuboid(int length, int breadth ,int h) {
        super(length, breadth);
        height = h;
    }
    void display()
    {
        System.out.println(super.x);
        System.out.println(x);
    }
}
public class this_super {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(10,5,15);
        c.display();
      /*  System.out.println(c.breadth);
        System.out.println(c.height);
        System.out.println(c.length);
        System.out.println(c.x); */

    }
}