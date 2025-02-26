package financelabs.limitcontrol.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientCreateResponseDTO {
    private String cpf;
    private boolean approved;
}
