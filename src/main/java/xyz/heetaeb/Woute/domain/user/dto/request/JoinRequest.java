package xyz.heetaeb.Woute.domain.user.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JoinRequest {
    private String email; 
    private String nickname;
    private String password;
}
