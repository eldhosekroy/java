// Polymorphism
import java.util.*;

class polimor {
    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Hexagon h = new Hexagon();
        r.numberOfSides();
        t.numberOfSides();
        h.numberOfSides();
    }
}

abstract class Shape {
    public abstract void numberOfSides();  // Fix the method name to match case
}

class Rectangle extends Shape {
    public void numberOfSides() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rectangle sides : ");
        int i = sc.nextInt();
        System.out.println("No of Sides : " + i);
    }
}

class Triangle extends Shape {
    public void numberOfSides() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Triangle sides : ");
        int i = sc.nextInt();
        System.out.println("No of Sides : " + i);
    }
}

class Hexagon extends Shape {
    public void numberOfSides() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Hexagon sides : ");
        int i = sc.nextInt();
        System.out.println("No of Sides : " + i);
    }
}
