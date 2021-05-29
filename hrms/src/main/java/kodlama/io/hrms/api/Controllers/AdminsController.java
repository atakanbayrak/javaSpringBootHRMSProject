package kodlama.io.hrms.api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.Abstracts.AdminsService;
import kodlama.io.hrms.core.results.DataResult;
import kodlama.io.hrms.entities.Concretes.Admins;

@RestController
@RequestMapping("/api/admins")
public class AdminsController {

	public AdminsController() {
		
	}
	
	private AdminsService adminsService;
	
	@Autowired
	public AdminsController(AdminsService adminsService) {
		this.adminsService = adminsService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Admins>>  getAll(){
		return this.adminsService.getAll();
	}
	
	@PostMapping("/add")
	public DataResult<List<Admins>> add(@RequestBody Admins admins){
		return adminsService.add(admins);
	}
	
	
}
