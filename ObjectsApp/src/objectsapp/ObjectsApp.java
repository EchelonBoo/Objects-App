package objectsapp;


public class ObjectsApp {

    public static void main(String[] args) {
        Circle myCircle = new Circle(5); //creates a circle object
        Cylinder myCylinder = new Cylinder(5,2); // creates a cylinder object
        
        System.out.println("[Circle]");
        System.out.println();
        System.out.println("The radius of the circle is " + myCircle.getRadius());
        System.out.println("The area of the circle is " + myCircle.findArea());
        
        System.out.println();
        System.out.println("********************************************************");
        System.out.println();

        System.out.println("[Cylinder]");
        System.out.println();
        System.out.println("The length of th cylinder is " + myCylinder.getLength());
        System.out.println("The raduis of the cylinder is " + myCylinder.getRadius());
        System.out.println("The area of the cylinder is " + myCylinder.findArea());
        System.out.println("The volume of the cylinder is " + myCylinder.findVolume());
        System.out.println("The surface area of the cylnider is " + myCylinder.findArea());
    }
    
}
