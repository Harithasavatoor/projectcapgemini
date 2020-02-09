package com.capgemini.medicalstoremanagement.dao;

import com.capgemini.medicalstoremanagement.dto.VisitorInfo;
import com.capgemini.medicalstoremanagement.dto.VisitorMedicineInfo;

public interface VisitorDAO {
	static VisitorInfo visitorinfo = new VisitorInfo();
	static VisitorMedicineInfo visitormedinfo = new VisitorMedicineInfo();

	void detailsInfo();

	void medicineInfo();
}
