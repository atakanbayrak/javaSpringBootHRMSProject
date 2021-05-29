package kodlama.io.hrms.api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.Abstracts.EmployersService;
import kodlama.io.hrms.core.results.DataResult;
import kodlama.io.hrms.entities.Concretes.Employers;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {
	
	public EmployerController() {
		// TODO Auto-generated constructor stub
	}
	
	private EmployersService employersService;
	
	@Autowired
	public EmployerController(EmployersService employersService) {
		// TODO Auto-generated constructor stub
		this.employersService = employersService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Employers>> getAll(){
		return this.employersService.getAll();
	}
	
	@PostMapping("/add")
	public DataResult<List<Employers>> add(@RequestBody Employers employers){
		return employersService.add(employers);
	}
	
	
}
