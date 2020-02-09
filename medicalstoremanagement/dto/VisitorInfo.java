package com.capgemini.medicalstoremanagement.dto;


import java.sql.Date;



public class VisitorInfo {
	private int userId;
	private String userName;
	private int userMobno;
	private String userAddress;
	private int pincode;
	private Date userDob;
	private String userDisease;
	private int medicineId;
	private Date medbookingDate;
	private String userPassword;
	private int userBookingId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String username) {
		this.userName = username;
	}

	public int getUserMobno() {
		return userMobno;
	}

	public void setUserMobno(int userMobno) {
		this.userMobno = userMobno;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Date getUserDob() {
		return userDob;
	}

	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}

	public String getUserDisease() {
		return userDisease;
	}

	public void setUserDisease(String userDisease) {
		this.userDisease = userDisease;
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public Date getMedbookingDate() {
		return medbookingDate;
	}

	public void setMedbookingDate(Date medbookingDate) {
		this.medbookingDate = medbookingDate;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getUserBookingId() {
		return userBookingId;
	}

	public void setUserBookingId(int userBookingId) {
		this.userBookingId = userBookingId;
	}

}
