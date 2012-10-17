package com.andre.selenium.telas.brasileirao;

public class Times {
	

	private String time;
	private String pg;
	private String j;
	private String v;
	private String e;
	private String d;
	private String gp;
	private String gc;
	private String sg;
	private String aproveitamento;

	public Times() {
		super();
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPg() {
		return pg;
	}

	public void setPg(String pg) {
		this.pg = pg;
	}

	public String getJ() {
		return j;
	}

	public void setJ(String j) {
		this.j = j;
	}

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}

	public String getE() {
		return e;
	}

	public void setE(String e) {
		this.e = e;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public String getGp() {
		return gp;
	}

	public void setGp(String gp) {
		this.gp = gp;
	}

	public String getGc() {
		return gc;
	}

	public void setGc(String gc) {
		this.gc = gc;
	}

	public String getSg() {
		return sg;
	}

	public void setSg(String sg) {
		this.sg = sg;
	}

	public String getAproveitamento() {
		return aproveitamento;
	}

	public void setAproveitamento(String aproveitamento) {
		this.aproveitamento = aproveitamento;
	}

	@Override
	public String toString() {
		return "Clube: " + time + ", Pontos Ganhos: " + pg + ", Jogos: " + j + ", Vitórias: " + v
				+ ", Empates: " + e + ", Derrotas: " + d + ", Gols Pró: " + gp + ", Gols Contra: " + gc
				+ ", Saldo Gols: " + sg + ", Aproveitamento=" + aproveitamento + "\n";
	}
	

}
