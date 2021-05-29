package kodlama.io.hrms.business.Abstracts;

import java.util.List;

import kodlama.io.hrms.core.results.DataResult;
import kodlama.io.hrms.entities.Concretes.Users;

public interface UsersService {

	DataResult<List<Users>> getAll();
	
	
}
