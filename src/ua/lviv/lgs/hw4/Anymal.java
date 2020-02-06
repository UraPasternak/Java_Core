package ua.lviv.lgs.hw4;

public class Anymal {
	private String nameAnymal;
	private int vAnymal;
	private int agAnymal;

	public Anymal(String nameAnymal, int vAnymal, int agAnymal) {
		super();
		this.nameAnymal = nameAnymal;
		this.vAnymal = vAnymal;
		this.agAnymal = agAnymal;
	}

	public String getNameAnymal() {
		return nameAnymal;
	}

	public void setNameAnymal(String nameAnymal) {
		this.nameAnymal = nameAnymal;
	}

	public int getvAnymal() {
		return vAnymal;
	}

	public void setvAnymal(int vAnymal) {
		this.vAnymal = vAnymal;
	}

	public int getAgAnymal() {
		return agAnymal;
	}

	public void setAgAnymal(int agAnymal) {
		this.agAnymal = agAnymal;
	}

}
