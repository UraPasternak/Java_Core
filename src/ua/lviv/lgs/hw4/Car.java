package ua.lviv.lgs.hw4;

public class Car {
	private String markaCar;
	private Helm helmCar;
	private Wheel wheelCar;
	private Body bodyCar;

	public Car(String markaCar, Helm helmCar, Wheel wheelCar, Body bodyCar) {
		super();
		this.markaCar = markaCar;
		this.helmCar = helmCar;
		this.wheelCar = wheelCar;
		this.bodyCar = bodyCar;
	}

	public String getMarkaCar() {
		return markaCar;
	}

	public void setMarkaCar(String markaCar) {
		this.markaCar = markaCar;
	}

	public Helm getHelmCar() {
		return helmCar;
	}

	public void setHelmCar(Helm helmCar) {
		this.helmCar = helmCar;
	}

	public Wheel getWheelCar() {
		return wheelCar;
	}

	public void setWheelCar(Wheel wheelCar) {
		this.wheelCar = wheelCar;
	}

	public Body getBodyCar() {
		return bodyCar;
	}

	public void setBodyCar(Body bodyCar) {
		this.bodyCar = bodyCar;
	}

	@Override
	public String toString() {
		return "Car [markaCar=" + markaCar + ", helmCar=" + helmCar + ", wheelCar=" + wheelCar + ", bodyCar=" + bodyCar
				+ "]";
	}

	public void plusmarkaCar(String n) {
		this.markaCar = this.markaCar + n;
	}

	public void doubl() {
		this.helmCar.dubldHelm();
		this.wheelCar.dublsizeWheel();
	}

}
