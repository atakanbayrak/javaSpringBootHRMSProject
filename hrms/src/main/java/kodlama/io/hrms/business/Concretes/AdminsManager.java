package kodlama.io.hrms.business.Concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.Abstracts.AdminsService;
import kodlama.io.hrms.core.email.Abstarcts.IRegex;
import kodlama.io.hrms.core.results.DataResult;
import kodlama.io.hrms.dataAccess.Abstracts.AdminsDao;
import kodlama.io.hrms.entities.Concretes.Admins;

@Service
public class AdminsManager implements AdminsService{

	private AdminsDao adminsDao;
	private IRegex regex;
	
	
	@Autowired
	public AdminsManager(AdminsDao adminsDao, IRegex regex) {
		this.adminsDao = adminsDao;
		this.regex = regex;
	}
	
	@Override
	public DataResult<List<Admins>>   getAll() {
		
		return new DataResult<List<Admins>>(this.adminsDao.findAll(), null);			
				
	}

	@Override
	public DataResult<List<Admins>> add(Admins admins) {
		
		if(this.regex.RegexDogrulama(admins)) {
			adminsDao.save(admins);
			return new DataResult<List<Admins>>(this.adminsDao.findAll(), true, "Admin Eklendi");
		}
		else {
			return new DataResult<List<Admins>>(this.adminsDao.findAll(), false, "Admin Eklenemedi");
		}
		
		
	}

}
