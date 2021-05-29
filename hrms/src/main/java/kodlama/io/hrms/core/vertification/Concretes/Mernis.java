package kodlama.io.hrms.core.vertification.Concretes;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.core.vertification.Abstracts.IMernis;
import kodlama.io.hrms.entities.Concretes.JobSeekers;

@Service
public class Mernis implements IMernis{
	
	private boolean dogrulama;	
	
	public boolean Dogrulama(JobSeekers jobSeekers) {
		
		if(jobSeekers.getFirstName().length() > 2) {
			
			if(jobSeekers.getLastName().length() > 2) {
				
				dogrulama = true;				
			}
		}
		else {
			dogrulama = false;
		}
		
		return dogrulama;
	}
	
	
	
}
