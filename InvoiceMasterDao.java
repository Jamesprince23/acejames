package exercise9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import exercise9.DBUtility;

public class InvoiceMasterDao{

	public InvoiceMasterDto findByID(int uid) {
		// TODO Auto-generated method stub
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from Invoice_master where customerid=?");
			ps.setInt(1, uid);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				InvoiceMasterDto InvoiceMasterDto = new InvoiceMasterDto();
				InvoiceMasterDto.setCustomerid(rs.getInt("customerid"));
				InvoiceMasterDto.setDate(rs.getString("date"));
				InvoiceMasterDto.setInvoiceno(rs.getString("invoiceno"));

				return InvoiceMasterDto;
			}
			else {
				return null;
			}
		}catch(Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
		
	}

	public InvoiceMasterDto findBydate(String date) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from Invoice_no where date=?");
			ps.setString(1, date);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				InvoiceMasterDto InvoiceMasterDto = new InvoiceMasterDto();
				InvoiceMasterDto.setCustomerid(rs.getInt("customerid"));
				InvoiceMasterDto.setDate(rs.getString("date"));
				InvoiceMasterDto.setInvoiceno(rs.getString("invoiceno"));

				return InvoiceMasterDto;
			}
			else {
				return null;
			}
		}catch(Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}




	public int deleteUserByInvoiceno(int invoiceno) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from Invoice_master where invoiceno=?");
			ps.setInt(1, invoiceno);
			int n = ps.executeUpdate();
			DBUtility.closeConnection(null);
			return n;
		}catch(Exception e) {
			e.printStackTrace();
			
			//If there's an exception, it will be rolled back to the previous state
			DBUtility.closeConnection(e);
			return 0;
		}
	}

	public int deleteUserByName(String uname) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		
		InvoiceMasterDao users = new InvoiceMasterDao();

//		System.out.println(users.findByID(4));
        System.out.println( users.deleteUserByInvoiceno(1234));
		
//		InvoiceMasterDto InvoiceMasterDto = users.findByID(3);
//		users.updateUser(InvoiceMasterDto);
		//users.deleteUserByID(2);
//		System.out.println(users.deleteUserByID(3));
		
	}

}
