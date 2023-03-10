package exercise9;

import java.io.Serializable;
import java.util.Objects;

public class CustomerMasterDto implements Comparable<InvoiceMasterDto>,Serializable{
	public CustomerMasterDto(int customerid, String customername, String customeraddress) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.customeraddress = customeraddress;
	}
	public CustomerMasterDto() {
		// TODO Auto-generated constructor stub
	}
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	@Override
	public int hashCode() {
		return Objects.hash(customeraddress, customerid, customername);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerMasterDto other = (CustomerMasterDto) obj;
		return Objects.equals(customeraddress, other.customeraddress) && customerid == other.customerid
				&& Objects.equals(customername, other.customername);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "CustomerMasterDto [customerid=" + customerid + ", customername=" + customername + ", customeraddress="
				+ customeraddress + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	private int customerid;
	private String customername,customeraddress;
	@Override
	public int compareTo(InvoiceMasterDto o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	}
