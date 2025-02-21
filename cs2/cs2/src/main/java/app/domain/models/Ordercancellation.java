package app.domain.models;


import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor

public class Ordercancellation {
	private long orderId;
	private long petId;
	private long ownerId;
	private long veterinaryId;
	private String medicinedosage;
	private Timestamp generationDate;
	
	public Ordercancellation(long orderId, long petId, long ownerId, long veterinaryId, String medicinedosage,
			Timestamp generationDate) {
		super();
		this.orderId = orderId;
		this.petId = petId;
		this.ownerId = ownerId;
		this.veterinaryId = veterinaryId;
		this.medicinedosage = medicinedosage;
		this.generationDate = generationDate;
		
	}
	
	
	

}
