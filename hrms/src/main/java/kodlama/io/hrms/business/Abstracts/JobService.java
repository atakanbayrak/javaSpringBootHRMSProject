package kodlama.io.hrms.business.Abstracts;

import java.util.List;

import kodlama.io.hrms.entities.Concretes.Jobs;

public interface JobService {

	List<Jobs> getAll();
}
