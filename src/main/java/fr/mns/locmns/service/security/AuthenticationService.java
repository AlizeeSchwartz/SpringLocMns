package fr.mns.locmns.service.security;

import fr.mns.locmns.dto.security.LoginRequest;

public interface AuthenticationService {

    String login(LoginRequest request);

}
