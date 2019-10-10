/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectsapp;

/**
 *
 * @author betha
 */
public class Cylinder extends Circle {
        
    private double length;

    //General constructor, sets the radius and the length the a default of 1.0
    public Cylinder() {
        super(); //gets the default radius (1.0) from the superclass
        length = 1.0;
    }

    //Constructor that sets the length and radiius to whatever the object is initialised to
    public Cylinder(double length, double radius) {
        super(radius);
        this.length = length;
    }

    //getter method for lenght; returns length
    public double getLength() {
        return length;
    }

    //setter methos for the length; sets the length
    public void setLength(double length) {
        this.length = length;
    }
    
    //returns the volume of a cylinder
    public double findVolume(){
        return findArea() * length;
    }

    //overrides the findArea() method from the superclass
    public double findArea(){
        return 2 * super.findArea() + (2 * getRadius() * Math.PI) * length;
    }
    
}
