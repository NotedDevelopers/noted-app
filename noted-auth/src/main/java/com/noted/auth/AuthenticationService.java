package com.noted.auth;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
  private final UserRepository userRepository = new UserRepositoryImpl();

  public AuthenticationDetails checkAuthentication(HttpServletRequest request) {
    var token = request.getHeader("X-Auth-Token");
    if (token == null) {
      throw new UnauthenticatedException();
    }

    var user = userRepository.findByToken(token);

    if (user == null) {
      throw new UnauthenticatedException();
    }

    var details = new AuthenticationDetails();
    details.setUserName(user.getUserName());

    return details;
  }
}
