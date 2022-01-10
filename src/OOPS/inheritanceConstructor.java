/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 11/01/2022
 */

package OOPS;
class Parent
{
    public Parent()
    {
        System.out.println("Parent constructor");
    }
}
class child extends Parent
{
    public child()
    {
        System.out.println("child constructor");
    }
}

public class inheritanceConstructor {
    public static void main(String[] args) {
        child c = new child();
       // Parent p = new Parent();
    }
}