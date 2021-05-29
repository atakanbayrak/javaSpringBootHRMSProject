package kodlama.io.hrms.dataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.Concretes.Jobs;

public interface JobsDao extends JpaRepository<Jobs, Integer>{

}
