package com.cg.hsm.test;

import java.util.List;
import java.util.Scanner;
import com.cg.hsm.dao.FinanceDAO;
import com.cg.hsm.dao.PatientDAO;
import com.cg.hsm.daoimpl.FinanceDAOImpl;
import com.cg.hsm.daoimpl.PatientDAOImpl;
import com.cg.hsm.domain.Patient;
import com.cg.hsm.exception.FinanceFeeColumnEmpty;
import com.cg.hsm.exception.PatientFinanceDetailsNotFound;

public class FinanceDAOImplTestUpdate{

	public static void main(String[] args) throws PatientFinanceDetailsNotFound, FinanceFeeColumnEmpty {
		FinanceDAO financeDAO = new FinanceDAOImpl();
		PatientDAO patientDAO = new PatientDAOImpl();
		Patient patient = new Patient();
		
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter Patient Name");
		String name = sca.nextLine();
		System.out.println("Enter the updated amount");
		double amount = sca.nextDouble();
		List<Patient> patients = patientDAO.getAllPatientDetails();
		for(Patient pat:patients) {
			if(pat.getPatientName().equalsIgnoreCase(name)) {
				 patient = pat;
				 break;
		} 
		}
		financeDAO.updateFee(patient.getPatientId(),amount);
		System.out.println("Finance details successfully updated!");
		sca.close();
	}

}
