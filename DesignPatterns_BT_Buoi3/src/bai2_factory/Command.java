package bai2_factory;

public abstract class Command {
	protected long ma;
	protected String loai;	
	
	public long getMa() {
		return ma;
	}

	public String getLoai() {
		return loai;
	}

	public void setMa(long ma) {
		this.ma = ma;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public Command(long ma, String loai) {
		super();
		this.ma = ma;
		this.loai = loai;
	}

	public Command() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return getThongTin()+" [ma=" + ma + ", loai=" + loai + "]";
	}

	public abstract String getThongTin();
}
