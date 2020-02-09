package com.capgemini.medicalstoremanagment.daoimp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.capgemini.medicalstoremanagement.dao.VisitorDAO;
import com.capgemini.medicalstoremanagement.dto.VisitorInfo;

public class VisitorDAOImp implements VisitorDAO {
	public  void detailsInfo()  {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicalstore_db", "root", "root");
			String query = "select * from medicalstoreuserinfo";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				int userId = rs.getInt("userId");
				String userName = rs.getString("userName");
				int userMobno = rs.getInt("userMobno");
				String userAddress=rs.getString("userAddress");
				int userPincode=rs.getInt("userPincode");
				Date userDob=rs.getDate("userDob");
				String userDisease=rs.getString("userDisease");
				int medicineId=rs.getInt("medicineId");
				Date userMedBookingDate=rs.getDate("userMedBookingDate");
				String userPassword=rs.getString("userAddress");
				int userBookingId=rs.getInt("userBookingId");
				System.out.println("userid: "+userId);
				System.out.println("username: " +userName );
				System.out.println("usermobno: " + userMobno);
				System.out.println("useraddress: " + userAddress);
				System.out.println("userpincode: " + userPincode);
				System.out.println("userdob: " + userDob);
				System.out.println("userdisease: " + userDisease);
				System.out.println("medicineid: " + medicineId);
				System.out.println("usermedbookingdate: " + userMedBookingDate);
				System.out.println("userpassword: " + userPassword);
				System.out.println("userbookingid: " + userBookingId);
				//VisitorInfo visitorinfo=new VisitorInfo();
				visitorinfo.setUserId( rs.getInt("userId"));
				visitorinfo.setUserName(rs.getString("userName"));
				visitorinfo.setUserMobno( rs.getInt("userMobno"));
				visitorinfo.setUserAddress( rs.getString("userAddress"));
				visitorinfo.setPincode( rs.getInt("userPincode"));
				visitorinfo.setUserDob(rs.getDate("userDob"));
				visitorinfo.setUserDisease( rs.getString("userDisease"));
				visitorinfo.setMedicineId(rs.getInt("medicineId"));
				visitorinfo.setMedbookingDate(rs.getDate("usermedBookingDate"));
				visitorinfo.setUserPassword(rs.getString("userPassword"));
				visitorinfo.setUserBookingId(rs.getInt("userBookingId"));
				break;
				//System.out.println(visitorinfo.getUserId());
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}

		}
	public void medicineInfo()  {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicalstore_db", "root", "root");
			String query = "select * from medicalstoremedicineinfo";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				int medicineId = rs.getInt("medicineId");
				String medicineName = rs.getString("medicineName");
				int medicinePrice= rs.getInt("medicinePrice");
				Date medicineExpDate=rs.getDate("medicineMfgDate");
				Date medicineMfgDate =rs.getDate("medicineExpDate");
				String medicineCompany=rs.getString("medicineCompany");
				System.out.println("medicineId: "+medicineId);
				System.out.println("medicineName: "+medicineName);
				System.out.println("medicinePrice: "+medicinePrice);
				System.out.println("medicineExpDate: "+medicineMfgDate);
				System.out.println("medicineMfgDate: "+medicineExpDate);
				System.out.println("medicineCompany: "+medicineCompany);
			//	VisitorMedicineInfo visitormedinfo=new VisitorMedicineInfo();
				visitormedinfo.setMedicineId(rs.getInt("medicineId"));
				visitormedinfo.setMedicineName(rs.getString("medicineName"));
				visitormedinfo.setMedicinePrice(rs.getInt("medicinePrice"));
				visitormedinfo.setMedicineExpDate(rs.getDate("medicineMfgDate"));
				visitormedinfo.setMedicineMfgDate(rs.getDate("medicineExpDate"));
				visitormedinfo.setMedicineCompany(rs.getString("medicineCompany"));
				

			}
		}catch(
		Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
