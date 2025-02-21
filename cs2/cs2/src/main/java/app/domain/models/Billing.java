package app.domain.models;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor

public class Billing {
	private long invoiceId; 
    private long petId; 
    private long ownerId;
    private long productId; 
    private String productName; 
    private double productValue; 
    private int quantity; 
    private Timestamp date;
    
    
	public Billing(long invoiceId, long petId, long ownerId, long productId, String productName,
			double productValue, int quantity, Timestamp date) {
		super();
		this.invoiceId = invoiceId;
		this.petId = petId;
		this.ownerId = ownerId;
		this.productId = productId;
		this.productName = productName;
		this.productValue = productValue;
		this.quantity = quantity;
		this.date = date;
	}
    
    

}
