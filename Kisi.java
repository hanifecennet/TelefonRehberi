package hafta2;

public class Kisi {
	private String adi;
	private String telNo;
	
	public Kisi() {
		
		this.adi = "";
		this.telNo = "";
	}
	
	public Kisi(String adi, String telNo) {
	
		this.adi = adi;
		this.telNo = telNo;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	@Override
	public String toString() {
		return "Kisi [adi=" + adi + ", telNo=" + telNo + "]";
	}
	
	
	
	
}
