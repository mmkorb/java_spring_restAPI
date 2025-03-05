package securitylabs.strongpasswd.application.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "DTO for password validation response")
public class StrongPasswdResponseDTO {

    @Schema(description = "Indicates if the password is valid", example = "true")
    private boolean isValid;
}
