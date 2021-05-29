package kodlama.io.hrms.api.Controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.Abstracts.JobSeekersService;
import kodlama.io.hrms.core.results.DataResult;
import kodlama.io.hrms.entities.Concretes.JobSeekers;

@RestController
@RequestMapping("/api/jobSeekers")
public class JobSeekersController {

	private JobSeekersService jobSeekersService;	
	
	@Autowired
	public JobSeekersController(JobSeekersService jobSeekersService) {
		this.jobSeekersService = jobSeekersService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobSeekers>> getAll(){
		return this.jobSeekersService.getAll();
	}
	
	@PostMapping
	public DataResult<List<JobSeekers>> add(@RequestBody JobSeekers jobSeekers){
		return this.jobSeekersService.add(jobSeekers);
	}
}
