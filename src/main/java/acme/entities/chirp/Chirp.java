package acme.entities.chirp;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import acme.framework.entities.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Chirp extends AbstractEntity{

	// Serialisation identifier -----------------------------------------------

	protected static final long serialVersionUID = 1L;
	
	// Attributes -------------------------------------------------------------

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	@NotNull
	protected Date					creationMoment;
	
	@NotBlank
	@Length(max=100)
	protected String 				title;
	
	@NotBlank
	@Length(max=100)
	protected String 				author;
	
	@NotBlank
	@Length(max=255)
	protected String 				body;
	
	@Email
	protected String 				email;
	
	// Derived attributes -----------------------------------------------------
	
	// Relationships ----------------------------------------------------------
		
}
