package kodlama.io.hrms.api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.Abstracts.JobService;
import kodlama.io.hrms.entities.Concretes.Jobs;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

	
	private JobService jobService;
	
	@Autowired
	public JobController(JobService jobService) {
		
		this.jobService = jobService;
	}
	
	@GetMapping("/getAll")
	public List<Jobs> getAll() {
		
		return jobService.getAll();
		
	}
	
	
}
