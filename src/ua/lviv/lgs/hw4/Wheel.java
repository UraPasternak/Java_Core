package ua.lviv.lgs.hw4;

public class Wheel {
	private int sizeWheel;

	public Wheel(int sizeWheel) {
		this.sizeWheel = sizeWheel;
	}

	public int getSizeWheel() {
		return sizeWheel;
	}

	public void setSizeWheel(int sizeWheel) {
		this.sizeWheel = sizeWheel;
	}

	@Override
	public String toString() {
		return "Wheel [sizeWheel=" + sizeWheel + "]";
	}

	public void dublsizeWheel() {
		this.sizeWheel *= 2;
	}
}
