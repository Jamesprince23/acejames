package exercise9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import exercise9.DBUtility;

public class CustomerMasterDao {

	public CustomerMasterDto findByCustomerId(int Customerid) {
		// TODO Auto-generated method stub
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from Customer_master where customerid=?");
			ps.setInt(1, Customerid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				CustomerMasterDto CustomerMasterDto = new CustomerMasterDto();
				CustomerMasterDto.setCustomerid(rs.getInt("customerid"));
				CustomerMasterDto.setCustomername(rs.getString("customername"));
				CustomerMasterDto.setCustomeraddress(rs.getString("customeraddress"));

				return CustomerMasterDto;
			} else {
				return null;
			}
		} catch (Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}

	}

	public int deleteUserByCustomerAddress(String CustomerAddress) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from Customer_master where cusotmeraddress=?");
			ps.setString(1, CustomerAddress);
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

		CustomerMasterDao users = new CustomerMasterDao();

//		System.out.println(users.findByID(4));
		// System.out.println( users.deleteUserByCustomerAddress("chennai"));

		CustomerMasterDto CustomerMasterDto = users.findByCustomerId(20);
		System.out.println(CustomerMasterDto);
//		users.updateUser(CustomerMasterDto);
		// users.deleteUserByID(2);
//		System.out.println(users.deleteUserByID(3));

	}

}