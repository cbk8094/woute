package xyz.heetaeb.Woute.domain.user.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import xyz.heetaeb.Woute.domain.user.dto.request.JoinRequest;
import xyz.heetaeb.Woute.domain.user.dto.request.LoginRequest;
import xyz.heetaeb.Woute.domain.user.service.UserService;

@RestController
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;
	
	@Operation(summary = "로그인")
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody LoginRequest request){
		try {
			userService.login(request);
			return ResponseEntity.ok("로그인 완료");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("로그인 실패" + e.getMessage());
		}
	}
	
	@Operation(summary = "회원가입")
	@PostMapping("/join")
	public String joinUser(@RequestBody JoinRequest request) {
		try {
			System.out.println("aaaaa");
			System.out.println("email :"+request.getEmail());
			System.out.println("nickname :" +request.getNickname());
			System.out.println("password :"+request.getPassword());
			Long userId = userService.join(request);
			return "회원가입성공" + userId;
		} catch (Exception e) {
			e.printStackTrace();
			return "회원가입실패";
		}
	}
}
