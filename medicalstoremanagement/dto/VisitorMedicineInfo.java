package com.capgemini.medicalstoremanagement.dto;

import java.sql.Date;

public class VisitorMedicineInfo {
	int medicineId;
	String medicineName;
	int medicinePrice;
	Date medicineMfgDate;
	Date medicineExpDate;
	String medicineCompany;
	public int getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public int getMedicinePrice() {
		return medicinePrice;
	}
	public void setMedicinePrice(int medicinePrice) {
		this.medicinePrice = medicinePrice;
	}
	public Date getMedicineMfgDate() {
		return medicineMfgDate;
	}
	public void setMedicineMfgDate(Date medicineMfgDate) {
		this.medicineMfgDate = medicineMfgDate;
	}
	public Date getMedicineExpDate() {
		return medicineExpDate;
	}
	public void setMedicineExpDate(Date medicineExpDate) {
		this.medicineExpDate = medicineExpDate;
	}
	public String getMedicineCompany() {
		return medicineCompany;
	}
	public void setMedicineCompany(String medicineCompany) {
		this.medicineCompany = medicineCompany;
	}

}
