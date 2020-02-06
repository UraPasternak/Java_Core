package ua.lviv.lgs.hw4;

public class Body {
	private int vagaBody;

	public Body(int vagaBody) {
		this.vagaBody = vagaBody;
	}

	public int getVagaBody() {
		return vagaBody;
	}

	public void setVagaBody(int vagaBody) {
		this.vagaBody = vagaBody;
	}

	@Override
	public String toString() {
		return "Body [vagaBody=" + vagaBody + "]";
	}

	public void plusVagaBody(int a) {
		this.vagaBody += a;
	}
}
