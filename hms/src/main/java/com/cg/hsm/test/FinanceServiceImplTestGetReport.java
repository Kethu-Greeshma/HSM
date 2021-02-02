package com.cg.hsm.test;

import java.util.Scanner;

import com.cg.hsm.domain.Finance;
import com.cg.hsm.exception.PatientFinanceDetailsNotFound;
import com.cg.hsm.service.FinanceService;
import com.cg.hsm.serviceimpl.FinanceServiceImpl;

public class FinanceServiceImplTestGetReport {

	public static void main(String[] args) {
		FinanceService fService = new FinanceServiceImpl();
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter the patient name");
		String name = sca.nextLine();
		Finance finance = new Finance();
		try {
			finance = fService.getPatientReport(name);
			System.out.println("**********************************Patient report is***************************");
			System.out.println("Patient id is "+finance.getPatientId());
			System.out.println("Patient name is "+finance.getPatientName());
			System.out.println("Patient admission fee is "+finance.getRegistrationFee());
			System.out.println("Patient doctor fee is "+finance.getDoctorFee());
			System.out.println("Patient medicines amount is "+finance.getMedicinesAmount());
			System.out.println("Patient total fee is "+finance.getTotalFee());
		} catch (PatientFinanceDetailsNotFound e) {
			System.out.println("*********Please enter valid name**********");
		}
		sca.close();
}
}
