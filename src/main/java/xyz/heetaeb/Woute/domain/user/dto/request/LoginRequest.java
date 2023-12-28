package xyz.heetaeb.Woute.domain.user.dto.request;

import java.time.ZonedDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
	private String nickname;
	private String password;
	private String email;
	private String provider;
}
