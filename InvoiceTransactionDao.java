package exercise9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import exercise9.DBUtility;

public class InvoiceTransactionDao {

	public InvoiceTransactionDto findByitemno(int itemno) {
		// TODO Auto-generated method stub
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from Invoice_transaction where itemno=?");
			ps.setInt(1, itemno);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				InvoiceTransactionDto InvoiceTransactionDto = new InvoiceTransactionDto();
				InvoiceTransactionDto.setInvoiceno(rs.getInt("invoiceno"));
				InvoiceTransactionDto.setItemno(rs.getInt("itemno"));
				InvoiceTransactionDto.setItemqty(rs.getInt("itemqty"));

				return InvoiceTransactionDto;
			} else {
				return null;
			}
		} catch (Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}

	}

	public int deleteByinvoiceno(int invoiceno) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from Invoice_transaction where invoiceno=?");
			ps.setInt(1, invoiceno);
			int n = ps.executeUpdate();
			DBUtility.closeConnection(null);
			return n;
		} catch (Exception e) {
			e.printStackTrace();

			// If there's an exception, it will be rolled back to the previous state
			DBUtility.closeConnection(e);
			return 0;
		}
	}

	public static void main(String[] args) {

		InvoiceTransactionDao users = new InvoiceTransactionDao();

//		System.out.println(users.findByID(4));
		// System.out.println( users.deleteUserByCustomerAddress("chennai"));

		InvoiceTransactionDto InvoiceTransactionDto = users.findByitemno(12);
		System.out.println(InvoiceTransactionDto);
//		users.updateUser(InvoiceTransactionDto);
		// users.deleteUserByID(2);
//		System.out.println(users.deleteUserByID(3));

	}
}
