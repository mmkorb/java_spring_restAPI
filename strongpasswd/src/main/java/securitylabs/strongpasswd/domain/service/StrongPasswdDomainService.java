package securitylabs.strongpasswd.domain.service;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StrongPasswdDomainService {
    public boolean validatePassword(String password) {
        return true;
    }
}
