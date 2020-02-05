package ua.lviv.lgs.hw;

public class Rectangle {
	  private double width;
	  private double length;

	  public Rectangle(double width, double length) {
	    this.width = width;
	    this.length = length;
	  }

	  public Rectangle( ) {
	    this.width = 25.0;
	    this.length = 35.0;
	  }

	  public double getWidth() {
	    return width;
	  }

	  public void setWidth(double width) {
	    this.width = width;
	  }

	  public double getLength() {
	    return length;
	  }

	  public void setLength(double length) {
	    this.length = length;
	  }

	  public void calcArea() {
	    System.out.println("Площа прямокутника = " + (getLength() * getWidth()));
	  }

	  public void calcPerimeter() {
	    System.out.println("Периметр прямокутника = " + (2 * (getWidth() + getLength())));
	  }
	}
