package acme.entities.tookit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import acme.framework.entities.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Toolkit extends AbstractEntity{

	// Serialisation identifier -----------------------------------------------

	protected static final long serialVersionUID = 1L;

	// Attributes -------------------------------------------------------------

	@Column(unique=true)
	@Pattern(regexp = "^[A-Z]{3}-[0-9]{3}(-[A-Z])?$")
	protected String 				code;
	
	@NotBlank
	@Size(max=100)
	protected String 				title;
	
	@NotBlank
	@Size(max=255)
	protected String 				description;
	
	@NotBlank
	@Size(max=255)
	protected String 				assemblyNotes;
	
	@URL
	protected String 				link;
	
	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}