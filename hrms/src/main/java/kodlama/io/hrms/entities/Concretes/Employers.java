package kodlama.io.hrms.entities.Concretes;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data

@Entity
@Table(name ="employers")
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Employers extends Users{

	// none yapmayı dene
	
	
	@Column(name ="employer_id")
	private int employerId;
	
	@Column(name ="company_name")
	private String companyName;
	
	@Column(name ="tel_number")
	private String telNumber;
}
