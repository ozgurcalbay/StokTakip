package tr.com.ekolsan.types;

import java.sql.Date;

public class StokContract {

	private int id;
	private int pesonelId;
	private int urunId;
	private Date tarih;
	private int adet;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPesonelId() {
		return pesonelId;
	}

	public void setPesonelId(int pesonelId) {
		this.pesonelId = pesonelId;
	}

	public int getUrunId() {
		return urunId;
	}

	public void setUrunId(int urunId) {
		this.urunId = urunId;
	}

	public Date getTarih() {
		return tarih;
	}

	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}

	public int getAdet() {
		return adet;
	}

	public void setAdet(int adet) {
		this.adet = adet;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + pesonelId + " " + urunId + " " + tarih + " " + adet;

	}
}
