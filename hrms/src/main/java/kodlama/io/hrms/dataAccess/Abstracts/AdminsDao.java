package kodlama.io.hrms.dataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.Concretes.Admins;

public interface AdminsDao extends JpaRepository<Admins, Integer>{

}
