package securitylabs.strongpasswd.application.controller;

import securitylabs.strongpasswd.application.dto.StrongPasswdRequestDTO;
import securitylabs.strongpasswd.application.dto.StrongPasswdResponseDTO;
import securitylabs.strongpasswd.application.service.StrongPasswdService;
import lombok.RequiredArgsConstructor;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/strongpasswd")
@RequiredArgsConstructor
@Tag(name = "Password Validation", description = "Endpoint for password validation")
public class StrongPasswdController {

    private final StrongPasswdService strongPasswdService;

    @Operation(
        summary = "Health check",
        description = "Verifies if the API is running",
        responses = {
            @ApiResponse(responseCode = "200", description = "Service is running")
        }
    )
    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("OK");
    }

    @Operation(
        summary = "Validate password",
        description = "Checks if the provided password meets security requirements",
        responses = {
            @ApiResponse(responseCode = "200", description = "Validation result",
                content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = StrongPasswdResponseDTO.class))),
            @ApiResponse(responseCode = "400", description = "Invalid request format")
        }
    )
    @PostMapping("/validate")
    public ResponseEntity<StrongPasswdResponseDTO> validatePassword(@RequestBody StrongPasswdRequestDTO request) {
        return ResponseEntity.ok(strongPasswdService.isValid(request));
    }
}
