package xyz.heetaeb.Woute.domain.user.entity;

import java.time.ZonedDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "w_user")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_SEQ", allocationSize = 1)
	private long id;
	private String nickname;
	private String password;
	private String email;
	private String profileImage;
	private String introduction;
	private String provider;
	private ZonedDateTime createdAt;
	private ZonedDateTime updatedAt;
}
