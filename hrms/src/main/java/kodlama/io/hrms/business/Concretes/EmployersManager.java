package kodlama.io.hrms.business.Concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.Abstracts.EmployersService;
import kodlama.io.hrms.core.email.Abstarcts.IRegex;
import kodlama.io.hrms.core.results.DataResult;
import kodlama.io.hrms.dataAccess.Abstracts.EmployersDao;
import kodlama.io.hrms.entities.Concretes.Employers;

@Service
public class EmployersManager implements EmployersService{

	private EmployersDao employersDao;	
	private IRegex regex;
	
	@Autowired
	public EmployersManager(EmployersDao employersDao, IRegex regex) {
		this.employersDao = employersDao;
		
		this.regex = regex;
	}
	
	@Override
	public DataResult<List<Employers>> getAll() {
		// TODO Auto-generated method stub
		return new DataResult<List<Employers>>(this.employersDao.findAll(), true, null);
	}

	@Override
	public DataResult<List<Employers>> add(Employers employers) {
		
		if(this.regex.RegexDogrulama(employers) == true) {
			employersDao.save(employers);
			return new DataResult<List<Employers>>(this.employersDao.findAll(), true, "Employer Eklendi");
		}
		else {
			return new DataResult<List<Employers>>(this.employersDao.findAll(), false, "Employer Eklenemedi");
		}
		
	}

}
