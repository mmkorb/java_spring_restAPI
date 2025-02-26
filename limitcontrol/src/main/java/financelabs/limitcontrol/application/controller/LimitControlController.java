package financelabs.limitcontrol.application.controller;

import financelabs.limitcontrol.application.dto.ClientCreateRequestDTO;
import financelabs.limitcontrol.application.dto.ClientCreateResponseDTO;
import financelabs.limitcontrol.application.dto.ClientDTO;
import financelabs.limitcontrol.application.service.ClientService;
import lombok.RequiredArgsConstructor;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/limitcontrol")
@RequiredArgsConstructor
public class LimitControlController {

    private final ClientService clientService;

    @Operation(summary = "Create a new client", description = "This endpoint allows the creation of a new client", 
               responses = {
                   @io.swagger.v3.oas.annotations.responses.ApiResponse(
                       responseCode = "201", 
                       description = "Client successfully created", 
                       content = @io.swagger.v3.oas.annotations.media.Content(
                           mediaType = "application/json", 
                           schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = ClientCreateResponseDTO.class)
                       )
                   ),
                   @io.swagger.v3.oas.annotations.responses.ApiResponse(
                       responseCode = "400", 
                       description = "Invalid input data"
                   )
               })
    @PostMapping("/newclient")
    public ClientCreateResponseDTO createClient(@RequestBody @Parameter(description = "Client creation details") ClientCreateRequestDTO dto) {
        return clientService.createClient(dto);
    }

    @Operation(summary = "Get all clients", description = "Fetches a list of all clients", 
               responses = {
                   @io.swagger.v3.oas.annotations.responses.ApiResponse(
                       responseCode = "200", 
                       description = "Successfully retrieved list of clients", 
                       content = @io.swagger.v3.oas.annotations.media.Content(
                           mediaType = "application/json", 
                           schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = List.class)
                       )
                   )
               })
    @GetMapping("/clients")
    public List<ClientDTO> getAllClients() {
        return clientService.getAllClients();
    }
}
