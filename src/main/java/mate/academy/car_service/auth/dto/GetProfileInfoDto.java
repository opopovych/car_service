package mate.academy.car_service.auth.dto;

import java.util.HashSet;
import java.util.Set;
import lombok.Data;
import lombok.experimental.Accessors;
import mate.academy.car_service.model.Role;

@Data
@Accessors(chain = true)
public class GetProfileInfoDto {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private Set<Role> roles = new HashSet<>();
}
