package kodlama.io.hrms.business.Abstracts;


import java.util.List;

import kodlama.io.hrms.core.results.DataResult;
import kodlama.io.hrms.entities.Concretes.Employers;

public interface EmployersService {
	
	DataResult<List<Employers>> getAll();
	DataResult<List<Employers>> add(Employers employers);

}
