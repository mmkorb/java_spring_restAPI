package financelabs.limitcontrol.application.controller;

import financelabs.limitcontrol.application.dto.ClientCreateRequestDTO;
import financelabs.limitcontrol.application.dto.ClientCreateResponseDTO;
import financelabs.limitcontrol.application.dto.ClientDTO;
import financelabs.limitcontrol.application.service.ClientService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/limitcontrol")
@RequiredArgsConstructor
public class LimitControlController {

    private final ClientService clientService;

    @PostMapping("/newclient")
    public ClientCreateResponseDTO createClient(@RequestBody ClientCreateRequestDTO dto) {
        return clientService.createClient(dto);
    }

    @GetMapping("/clients")
    public List<ClientDTO> getAllClients() {
        return clientService.getAllClients();
    }
}
