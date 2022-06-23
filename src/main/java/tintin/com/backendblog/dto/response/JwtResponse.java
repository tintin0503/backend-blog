package tintin.com.backendblog.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
public class JwtResponse {
    private String token;
    private Long id;
    private String type = "Bearer";
    private String username;
    private String email;
    private List<String> roles;
}
