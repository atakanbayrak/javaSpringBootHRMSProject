package kodlama.io.hrms.business.Concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.Abstracts.JobService;
import kodlama.io.hrms.dataAccess.Abstracts.JobDao;
import kodlama.io.hrms.entities.Concretes.Jobs;

@Service
public class JobManager implements JobService{

	
	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		
		this.jobDao = jobDao;
	}
	
	@Override
	public List<Jobs> getAll() {
		
		return jobDao.findAll();
	}
	
}
