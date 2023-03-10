package exercise9;


import java.io.Serializable;
import java.util.Objects;


import java.io.Serializable;
import java.util.Objects;

public class InvoiceTransactionDto implements Comparable<InvoiceMasterDto>,Serializable{
	private int invoiceno,itemno,itemqty;
	public InvoiceTransactionDto(int invoiceno, int itemno, int itemqty) {
		super();
		this.invoiceno = invoiceno;
		this.itemno = itemno;
		this.itemqty = itemqty;
	}
	public InvoiceTransactionDto() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "InvoiceTransactionDto [invoiceno=" + invoiceno + ", itemno=" + itemno + ", itemqty=" + itemqty + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(invoiceno, itemno, itemqty);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceTransactionDto other = (InvoiceTransactionDto) obj;
		return invoiceno == other.invoiceno && itemno == other.itemno && itemqty == other.itemqty;
	}
	public int getInvoiceno() {
		return invoiceno;
	}
	public void setInvoiceno(int invoiceno) {
		this.invoiceno = invoiceno;
	}
	public int getItemno() {
		return itemno;
	}
	public void setItemno(int itemno) {
		this.itemno = itemno;
	}
	public int getItemqty() {
		return itemqty;
	}
	public void setItemqty(int itemqty) {
		this.itemqty = itemqty;
	}
	@Override
	public int compareTo(InvoiceMasterDto o) {
		// TODO Auto-generated method stub
		return 0;
	}
	


	}

