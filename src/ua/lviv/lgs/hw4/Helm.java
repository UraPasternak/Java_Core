package ua.lviv.lgs.hw4;

public class Helm {
	private int dHelm;

	public Helm(int dHelm) {
		this.dHelm = dHelm;
	}

	public int getdHelm() {
		return dHelm;
	}

	public void setdHelm(int dHelm) {
		this.dHelm = dHelm;
	}

	@Override
	public String toString() {
		return "Helm [dHelm=" + dHelm + "]";
	}

	public void dubldHelm() {
		this.dHelm *= 2;
	}
}
