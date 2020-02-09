package com.capgemini.medicalstoremanagement.controller;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.medicalstoremanagement.dao.VisitorDAO;
import com.capgemini.medicalstoremanagement.dto.VisitorInfo;
import com.capgemini.medicalstoremanagment.daoimp.VisitorDAOImp;
import com.capgemini.medicalstoremanagment.exception.TryToOrder;

public class VisitorController {
	static Logger log = LogManager.getLogger("main");

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		while (a != (1 | 2 | 3 | 4)) {
			log.debug("Press 1 to UserInformation: ");
			log.debug("Press 2 to MedicineInformation: ");
			log.debug("press 3 Try to order");
			log.debug("Press 4 to Go Back to Home ");
			log.debug("Please enter your choice..");
			log.debug("........................................................");
			a = scanner.nextInt();
			switch (a) {
			case 1:
				VisitorDAOImp visitordao = new VisitorDAOImp();
				visitordao.detailsInfo();
				log.debug("........................................................");
				break;
			// System.out.println(VisitorDAO.visitorinfo.getUserId());
			case 2:
				VisitorDAOImp visitordao1 = new VisitorDAOImp();
				visitordao1.medicineInfo();
				log.debug("........................................................");
				break;
			// System.out.println(VisitorDAO1.visitormedinfo.getMedicineId());
			case 3:
				TryToOrder trytoorder = new TryToOrder();
				trytoorder.order("ertu");
				break;
			case 4:
				log.debug("Go Back to Home");
				break;
			default:
				log.debug("Invalid");

			}

		}
	}
}