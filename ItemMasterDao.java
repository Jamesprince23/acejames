package exercise9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import exercise9.DBUtility;

public class ItemMasterDao {

	public ItemmasterDto findByitemno(int itemno) {
		// TODO Auto-generated method stub
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from Item_master where itemno=?");
			ps.setInt(1, itemno);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ItemmasterDto ItemmasterDto = new ItemmasterDto();
				ItemmasterDto.setItemno(rs.getInt("itemno"));
				ItemmasterDto.setItemdescription(rs.getString("itemdescription"));
				ItemmasterDto.setItemprice(rs.getInt("itemprice"));
				ItemmasterDto.setItemunit(rs.getInt("itemunit"));
				

				return ItemmasterDto;
			} else {
				return null;
			}
		} catch (Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}

	}

	public int deleteByitemprice(int itemprice) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from Item_master where itemprice=?");
			ps.setInt(1, itemprice);
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

		ItemMasterDao users = new ItemMasterDao();

//		System.out.println(users.findByID(4));
		// System.out.println( users.deleteUserByCustomerAddress("chennai"));

		ItemmasterDto itemmasterDto = users.findByitemno(1);
		System.out.println(itemmasterDto);
//		users.updateUser(ItemmasterDto);
		// users.deleteUserByID(2);
//		System.out.println(users.deleteUserByID(3));

	}
}