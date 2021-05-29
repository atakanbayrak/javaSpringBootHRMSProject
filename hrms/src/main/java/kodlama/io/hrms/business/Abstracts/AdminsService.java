package kodlama.io.hrms.business.Abstracts;

import java.util.List;

import kodlama.io.hrms.core.results.DataResult;
import kodlama.io.hrms.entities.Concretes.Admins;

public interface AdminsService {
	
	DataResult<List<Admins>> getAll();
	DataResult<List<Admins>> add(Admins admin);
}
