package financelabs.limitcontrol.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDTO {
    private String name;
    private String cpf;

    public ClientDTO(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

}