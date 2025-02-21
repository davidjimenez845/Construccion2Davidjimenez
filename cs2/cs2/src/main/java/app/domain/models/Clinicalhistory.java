package app.domain.models;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor

public class Clinicalhistory {
	private Timestamp date;
    private String veterinarianName;
    private String consultationReason;
    private String symptoms;
    private String diagnosis;
    private String procedure;
    private String medication;
    private String medicationDose;
    private int orderId;
    private String vaccinationHistory;
    private String medicationAllergies;
    private String procedureDetails;
	public Clinicalhistory(Timestamp date, String veterinarianName, String consultationReason, String symptoms,
			String diagnosis, String procedure, String medication, String medicationDose, int orderId,
			String vaccinationHistory, String medicationAllergies, String procedureDetails) {
		super();
		this.date = date;
		this.veterinarianName = veterinarianName;
		this.consultationReason = consultationReason;
		this.symptoms = symptoms;
		this.diagnosis = diagnosis;
		this.procedure = procedure;
		this.medication = medication;
		this.medicationDose = medicationDose;
		this.orderId = orderId;
		this.vaccinationHistory = vaccinationHistory;
		this.medicationAllergies = medicationAllergies;
		this.procedureDetails = procedureDetails;
	}
	
    

}
