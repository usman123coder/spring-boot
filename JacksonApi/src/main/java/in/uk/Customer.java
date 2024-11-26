package in.uk;



public class Customer {
	
	private int cusNo;
	private String cusName;
	private long contNo;
	private Address add;
	public int getCusNo() {
		return cusNo;
	}
	public void setCusNo(int cusNo) {
		this.cusNo = cusNo;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public long getContNo() {
		return contNo;
	}
	public void setContNo(long contNo) {
		this.contNo = contNo;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Customer [cusNo=" + cusNo + ", cusName=" + cusName + ", contNo=" + contNo + ", add=" + add + "]";
	}
	
	

}
