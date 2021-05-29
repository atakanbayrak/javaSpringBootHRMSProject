package kodlama.io.hrms.business.Abstracts;

import java.util.List;


import kodlama.io.hrms.core.results.DataResult;

import kodlama.io.hrms.entities.Concretes.JobSeekers;


public interface JobSeekersService {

	DataResult<List<JobSeekers>> getAll();
	
	DataResult<List<JobSeekers>> add(JobSeekers jobSeekers);
	
	
}
