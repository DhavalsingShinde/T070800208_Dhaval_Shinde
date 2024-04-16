package constructor;

public class customer {
	private String customername;
	private int customerid;
	private String customercity;
	
	//public customer()
	{
		
	}

	public customer() {
		super();
		System.out.println("default constructor");
		}

	public customer(String customername, int customerid, String customercity) {
		//super();
		this();
		
		this.customername = customername;
		this.customerid = customerid;
		this.customercity = customercity;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomercity() {
		return customercity;
	}

	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}
//to string
	@Override
	public String toString() {
		return "customer [customername=" + customername + ", customerid=" + customerid + ", customercity="
				+ customercity + ", getCustomername()=" + getCustomername() + ", getCustomerid()=" + getCustomerid()
				+ ", getCustomercity()=" + getCustomercity() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}
