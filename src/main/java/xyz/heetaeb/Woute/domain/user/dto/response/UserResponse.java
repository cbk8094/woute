package xyz.heetaeb.Woute.domain.user.dto.response;

import java.time.ZonedDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
	private long id;
	private String nickname;
	private String password;
	private String email;
	private String profileImage;
	private String introduction;
	private String Provider;
	private ZonedDateTime createdAt;
	private ZonedDateTime updatedAt;
}
