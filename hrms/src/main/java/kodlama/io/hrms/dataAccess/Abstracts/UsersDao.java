package kodlama.io.hrms.dataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.Concretes.Users;

public interface UsersDao extends JpaRepository<Users, Integer>{

}
