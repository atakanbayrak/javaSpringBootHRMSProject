package kodlama.io.hrms.entities.Concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="jobs")
public class Jobs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="jobs_id")
	private int id;
	
	@Column(name="job_name")
	private String jobName;
	
	public Jobs() {
		
	}
	
	public Jobs(int id, String jobName) {
		
		this.id = id;
		this.jobName = jobName;
	}
	
	
}
