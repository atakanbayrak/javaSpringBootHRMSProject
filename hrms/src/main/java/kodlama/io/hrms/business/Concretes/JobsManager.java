package kodlama.io.hrms.business.Concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.Abstracts.JobsService;
import kodlama.io.hrms.core.results.DataResult;
import kodlama.io.hrms.dataAccess.Abstracts.JobsDao;
import kodlama.io.hrms.entities.Concretes.Jobs;

@Service
public class JobsManager implements JobsService{

	
	private JobsDao jobDao;
	
	@Autowired
	public JobsManager(JobsDao jobDao) {
		
		this.jobDao = jobDao;
	}
	
	@Override
	public DataResult<List<Jobs>> getAll() {
		
		return new DataResult<List<Jobs>>(this.jobDao.findAll(), true);
	}

	@Override
	public DataResult<List<Jobs>> add(Jobs jobs) {
		// TODO Auto-generated method stub
		return new DataResult<List<Jobs>>(this.jobDao.findAll(),true, "İş eklendi");
	}
	
}
