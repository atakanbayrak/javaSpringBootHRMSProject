package kodlama.io.hrms.api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.Abstracts.JobsService;
import kodlama.io.hrms.core.results.DataResult;
import kodlama.io.hrms.entities.Concretes.Jobs;

@RestController
@RequestMapping("/api/jobs")

public class JobsController {

	private JobsService jobsService;

	@Autowired
	public JobsController(JobsService jobsService) {

		this.jobsService = jobsService;
	}

	@GetMapping("/getAll")
	public DataResult<List<Jobs>>  getAll() {

		return this.jobsService.getAll();

	}
	
	@PostMapping("/add")
	public DataResult<List<Jobs>> add(Jobs jobs){
		return this.jobsService.add(jobs);
	}

}
