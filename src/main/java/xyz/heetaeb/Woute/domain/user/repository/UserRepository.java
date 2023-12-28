package xyz.heetaeb.Woute.domain.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xyz.heetaeb.Woute.domain.user.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
	UserEntity findByEmail(String email);
}
