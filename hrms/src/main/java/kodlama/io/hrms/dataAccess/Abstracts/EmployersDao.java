package kodlama.io.hrms.dataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlama.io.hrms.entities.Concretes.Employers;

public interface EmployersDao extends JpaRepository<Employers, Integer>{

}
