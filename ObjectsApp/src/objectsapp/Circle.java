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
public class Circle {
    
    private double radius;

    //general constructor, initiliases radius to a default value
    public Circle() {
        radius = 1.0;
    }

    //contructor, sets the radius to whatever it is initialised as in the main program
    public Circle(double radius) {
        this.radius = radius;
    }

    //Radius getter method, returns the radius
    public double getRadius() {
        return radius;
    }

    //Radius setter method, sets the radius value
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    //returns the area of a circle
    public double findArea(){
        return radius * radius * 3.14;
    }
    
    
    
}
