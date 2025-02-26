package financelabs.limitcontrol.application.service;

import financelabs.limitcontrol.application.dto.ClientCreateRequestDTO;
import financelabs.limitcontrol.application.dto.ClientCreateResponseDTO;
import financelabs.limitcontrol.application.dto.ClientDTO;
//import financelabs.limitcontrol.domain.service.ClientDomainService;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {

    //private final ClientDomainService clientDomainService;

    public ClientCreateResponseDTO createClient(ClientCreateRequestDTO dto) {
        ClientCreateResponseDTO responseDTO = new ClientCreateResponseDTO();
        responseDTO.setCpf(dto.getCpf());
        responseDTO.setApproved(true);

        return responseDTO;
    }

    public List<ClientDTO> getAllClients() {
        List<ClientDTO> clientList = new ArrayList<>();

        clientList.add(new ClientDTO("Joao", "12345678900"));
        clientList.add(new ClientDTO("Maria", "98765432100"));

        return clientList;
    }
}
