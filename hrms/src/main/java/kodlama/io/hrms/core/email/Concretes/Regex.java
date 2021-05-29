package kodlama.io.hrms.core.email.Concretes;


import java.util.regex.Matcher;

import java.util.regex.Pattern;


import org.springframework.stereotype.Service;


import kodlama.io.hrms.core.email.Abstarcts.IRegex;

import kodlama.io.hrms.entities.Concretes.Users;

@Service
public class Regex implements IRegex {

	private String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
	Pattern pattern = Pattern.compile(regex);
	
	private boolean dogrulama;
	
	@Override
	public boolean RegexDogrulama(Users user) {
		
		Matcher matcher = pattern.matcher(user.getEmail());
		
		if(matcher.matches()) {
			dogrulama = true;
			return dogrulama;
		}
		else {
			dogrulama = false;
			return dogrulama;
		}
		
	}
	
	

}
