package securitylabs.strongpasswd.application.service;

import securitylabs.strongpasswd.application.dto.StrongPasswdRequestDTO;
import securitylabs.strongpasswd.application.dto.StrongPasswdResponseDTO;
import securitylabs.strongpasswd.domain.service.StrongPasswdDomainService;
 
import org.springframework.stereotype.Service;

@Service
public class StrongPasswdService {
 
    private final StrongPasswdDomainService strongPasswdDomainService;

    public StrongPasswdService(StrongPasswdDomainService strongPasswdDomainService) {
        this.strongPasswdDomainService = strongPasswdDomainService;
    }

    public StrongPasswdResponseDTO isValid(StrongPasswdRequestDTO requestDTO) {
        return new StrongPasswdResponseDTO(this.strongPasswdDomainService.validatePassword(requestDTO.getPassword()));
    }
}
