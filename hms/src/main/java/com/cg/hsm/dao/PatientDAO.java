package com.cg.hsm.dao;

import java.util.List;


import com.cg.hsm.domain.Patient;
import com.cg.hsm.domain.PatientHistory;
/**
 * This class perform CRUD operations on database
 * @author  Jyothi
 *
 */

public interface PatientDAO {
	
	/**
	 * This addPatient method will add new patient to database
	 * @param patient
	 */
	public void addPatient(Patient patient);
	/**
	 * This updatePatient will update doctor details in database
	 * @param patient
	 */
	public void updatePatient(Patient patient,int patientId);
	/**
	 * This deletePatient method will delete record of patient from database
	 * @param patient
	 */
	public void deletePatient(int patientId);
	/**
	 * This will return the list of all the doctors from database
	 * @return
	 */
	
	List<Patient> getAllPatientDetails();
	
	public void updatePatientHistory( PatientHistory patientHistory, int patientId);
}