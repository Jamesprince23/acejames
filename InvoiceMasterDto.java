package exercise9;

import java.io.Serializable;
import java.util.Objects;

//Serializable - way to send objects over the network
//Because we cant send the objects through the network,so we are sending ...like a recipe to create that object
public class InvoiceMasterDto implements Comparable<InvoiceMasterDto>,Serializable{

	private String date, invoiceno;
	private int customerid;

	@Override
	public int compareTo(InvoiceMasterDto o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getInvoiceno() {
		return invoiceno;
	}

	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerid, date, invoiceno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceMasterDto other = (InvoiceMasterDto) obj;
		return customerid == other.customerid && Objects.equals(date, other.date)
				&& Objects.equals(invoiceno, other.invoiceno);
	}

	@Override
	public String toString() {
		return "InvoiceMasterDto [date=" + date + ", invoiceno=" + invoiceno + ", customerid=" + customerid + "]";
	}

	public InvoiceMasterDto(String date, String invoiceno, int customerid) {
		super();
		this.date = date;
		this.invoiceno = invoiceno;
		this.customerid = customerid;
	}

	public InvoiceMasterDto() {
		// TODO Auto-generated constructor stub
	}

}



