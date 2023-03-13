package exercise9;

import java.io.Serializable;
import java.util.Objects;

public class ItemmasterDto implements Comparable<InvoiceMasterDto>,Serializable{
	public ItemmasterDto(int itemno, int itemprice, int itemunit, String itemdescription) {
		super();
		this.itemno = itemno;
		this.itemprice = itemprice;
		this.itemunit = itemunit;
		this.itemdescription = itemdescription;
	}
	public ItemmasterDto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ItemmasterDto [itemno=" + itemno + ", itemprice=" + itemprice + ", itemunit=" + itemunit
				+ ", itemdescription=" + itemdescription + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(itemdescription, itemno, itemprice, itemunit);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemmasterDto other = (ItemmasterDto) obj;
		return Objects.equals(itemdescription, other.itemdescription) && itemno == other.itemno
				&& itemprice == other.itemprice && itemunit == other.itemunit;
	}
	public int getItemno() {
		return itemno;
	}
	public void setItemno(int itemno) {
		this.itemno = itemno;
	}
	public int getItemprice() {
		return itemprice;
	}
	public void setItemprice(int itemprice) {
		this.itemprice = itemprice;
	}
	public int getItemunit() {
		return itemunit;
	}
	public void setItemunit(int itemunit) {
		this.itemunit = itemunit;
	}
	public String getItemdescription() {
		return itemdescription;
	}
	public void setItemdescription(String itemdescription) {
		this.itemdescription = itemdescription;
	}
	private int itemno, itemprice,itemunit;
	private String itemdescription;
	@Override
	public int compareTo(InvoiceMasterDto o) {
		// TODO Auto-generated method stub
		return 0;
	}



}
