package xyz.heetaeb.Woute.domain.user.service;

import java.time.Duration;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import xyz.heetaeb.Woute.domain.user.dto.request.JoinRequest;
import xyz.heetaeb.Woute.domain.user.dto.request.LoginRequest;
import xyz.heetaeb.Woute.domain.user.entity.UserEntity;
import xyz.heetaeb.Woute.domain.user.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
	@Autowired
	private UserRepository userRepository;

	@Transactional
	public Long join(JoinRequest request) {
		UserEntity user = UserEntity.builder()
			    .email(request.getEmail())
			    .nickname(request.getNickname())
			    .password(request.getPassword())
			    .provider("woute")
			    .build();
			return userRepository.save(user).getId();
	}
	public String login(LoginRequest dto) {
		UserEntity user = userRepository.findByEmail(dto.getEmail());
		if(user != null && !dto.getPassword().equals(user.getPassword())) {
			return "redirect:/login";
		}	
			return "redirect:/";
	}
	
//	public List<UserEntity> selectAll(){
//		return userRepository.findAll();
//	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	
//	public UserEntity update (UserEntity user) {
//		UserEntity returnUser = userRepository.save(user);
//		return returnUser;
//	}
}
