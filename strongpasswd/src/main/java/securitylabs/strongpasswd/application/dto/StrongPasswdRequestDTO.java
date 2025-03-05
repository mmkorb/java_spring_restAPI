package securitylabs.strongpasswd.application.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "DTO for password validation request")
public class StrongPasswdRequestDTO {

    @Schema(description = "Password to be validated", example = "Abc@12345", required = true)
    private String password;
}
