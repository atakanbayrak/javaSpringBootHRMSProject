package kodlama.io.hrms.business.Concretes;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlama.io.hrms.business.Abstracts.JobSeekersService;
import kodlama.io.hrms.core.email.Abstarcts.IRegex;
import kodlama.io.hrms.core.results.DataResult;
import kodlama.io.hrms.core.vertification.Abstracts.IMernis;
import kodlama.io.hrms.dataAccess.Abstracts.JobSeekersDao;
import kodlama.io.hrms.entities.Concretes.JobSeekers;


@Service
public class JobSeekersManager implements JobSeekersService{	
	
	private JobSeekersDao jobSeekersDao;
	private IMernis mernis;
	private IRegex regex;
	
	@Autowired
	public JobSeekersManager(JobSeekersDao jobSeekersDao,IMernis mernis, IRegex regex) {
		this.jobSeekersDao = jobSeekersDao;	
		this.mernis= mernis;
		this.regex= regex;
	}	
	
	
	@Override
	public DataResult<List<JobSeekers>> getAll() {
		// TODO Auto-generated method stub
		return new DataResult<List<JobSeekers>>("Goruntulendi");
	}	
	
	@Override
	public DataResult<List<JobSeekers>> add(JobSeekers jobSeekers) {
		// TODO Auto-generated method stub
		
		if(this.mernis.Dogrulama(jobSeekers) == true && this.regex.RegexDogrulama(jobSeekers) == true) {
			this.jobSeekersDao.save(jobSeekers);
			return new DataResult<List<JobSeekers>>(this.jobSeekersDao.findAll(), true, "JobSeeker Eklendi");
		}
		else {
			return new DataResult<List<JobSeekers>>(this.jobSeekersDao.findAll(), false, "JobSeeker Eklenemedi");
		}		
		
	}

	

}
