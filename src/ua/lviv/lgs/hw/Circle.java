package ua.lviv.lgs.hw;

public class Circle {
	  private double radius;
	  private double diameter;

	  public Circle(double radius, double diameter) {
	    this.radius = radius;
	    this.diameter = diameter;
	  }

	  public double getRadius() {
	    return radius;
	  }

	  public void setRadius(double radius) {
	    this.radius = radius;
	  }

	  public double getDiameter() {
	    return diameter;
	  }

	  public void setDiameter(double diameter) {
	    this.diameter = diameter;
	  }

	  public void calcArea() {
	    System.out.println("Площа кола = " + getDiameter() + " is " + (Math.pow(getDiameter(), 2) / 2));
	  }

	  public void calcLength() {
	    System.out.println("Довжина кола = " + getRadius() + " is " + (2 * Math.PI * getRadius()));
	  }
	}