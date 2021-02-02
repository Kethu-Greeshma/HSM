package com.cg.hsm.test;

import java.util.List;
import java.util.Scanner;

import com.cg.hsm.dao.DoctorDAO;
import com.cg.hsm.dao.FinanceDAO;
import com.cg.hsm.dao.PatientDAO;
import com.cg.hsm.daoimpl.DoctorDAOImpl;
import com.cg.hsm.daoimpl.FinanceDAOImpl;
import com.cg.hsm.daoimpl.PatientDAOImpl;
import com.cg.hsm.domain.Doctor;
import com.cg.hsm.domain.Finance;
import com.cg.hsm.domain.Patient;
import com.cg.hsm.domain.PatientCase;
import com.cg.hsm.exception.FinanceFeeColumnEmpty;
import com.cg.hsm.exception.PatientFinanceDetailsNotFound;

public class FinanceDAOImplTestAdd{

	public static void main(String[] args) throws PatientFinanceDetailsNotFound, FinanceFeeColumnEmpty {
		FinanceDAO financeDAO = new FinanceDAOImpl();
		
		Scanner sca = new Scanner(System.in);
//		System.out.println("Enter Patient Name");
//		String name = sca.nextLine();
//		System.out.println("Enter Registration fee");
//		double regFee = sca.nextDouble();
//		System.out.println("Enter Doctor fee");
//		double docFee = sca.nextDouble();
//		System.out.println("Enter medicines amount");
//		double medFee = sca.nextDouble();
//		System.out.println("Enter id");
//		int id = sca.nextInt();
//		Finance finance = new Finance(id,name,regFee,docFee,medFee,(regFee+docFee+medFee));
//		financeDAO.add(finance);
//		System.out.println("Finance Details Added successfully");
		
		
		
		
		
		PatientDAO patientDAO = new PatientDAOImpl();
		DoctorDAO doctorDAO = new DoctorDAOImpl();
		Patient patient = new Patient();
		
		System.out.println("Enter the patient name");
		String name = sca.nextLine();
		List<Patient> patients = patientDAO.getAllPatientDetails();
		for(Patient pat:patients) {
			if(pat.getPatientName().equalsIgnoreCase(name)) {
				 patient = pat;
				 break;
		} 
		}
		
		double regFee = patient.getAdmissionFee();
		double docFee = 0;
		PatientCase patCase = patient.getPatientCase();
		String docName = patCase.getAssociatedDoctorName();
		List<Doctor> doctors = doctorDAO.listAllDoctors();
		for(Doctor doc:doctors) {
			System.out.println("The doctor fee is ********************"+doc.getDoctorFee());
			if(doc.getDoctorName().equalsIgnoreCase(docName)) {
				docFee = doc.getDoctorFee();
		} 
		}
		
		double medicineCost = patCase.getMedicineFee();
		Finance finance = new Finance(patient.getPatientId(),name, regFee, docFee, medicineCost,(regFee+docFee+medicineCost));
		financeDAO.add(finance);
		System.out.println("Finance Details Successfully");
		sca.close();
	}

}
