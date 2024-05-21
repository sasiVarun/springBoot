package in.test;

public class Vendor {
	private int vid;
	private String vname;
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", vname=" + vname + "]";
	}
}
