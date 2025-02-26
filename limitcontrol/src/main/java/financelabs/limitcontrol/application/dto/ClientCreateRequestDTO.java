package financelabs.limitcontrol.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientCreateRequestDTO {
    private String nome;
    private String cpf;
}
