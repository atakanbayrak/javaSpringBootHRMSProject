package kodlama.io.hrms.business.Abstracts;

import java.util.List;

import kodlama.io.hrms.core.results.DataResult;
import kodlama.io.hrms.entities.Concretes.Jobs;

public interface JobsService {

	DataResult<List<Jobs>>  getAll();
	DataResult<List<Jobs>> add(Jobs jobs);
}
