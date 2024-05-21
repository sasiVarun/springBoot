package in.test;

public class Product {
	
	private int pid;
	private String pcode;
	private Vendor vob;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public Vendor getVob() {
		return vob;
	}
	public void setVob(Vendor vob) {
		this.vob = vob;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pcode=" + pcode + ", vob=" + vob + "]";
	}
}
