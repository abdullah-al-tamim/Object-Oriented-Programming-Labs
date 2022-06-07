/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4_maintriangle;

/**
 *
 * @author Admin
 */
public class Triangle extends GEometricObject{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
//  constructors
    public Triangle() {
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
//     getters
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
//    area, perimeter, tostring
    public double getArea(){
        double val = (side1+side2+side3)/2;
        return Math.sqrt(val*(val-side1)*(val-side2)*(val-side3));
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1= " + side1 + ", side2= " + side2 + ", side3= " + side3+", color= "+getColor()+", Filled= "+isFilled();
    }
}
