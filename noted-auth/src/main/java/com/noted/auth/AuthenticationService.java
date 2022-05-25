package com.noted.auth;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
  public AuthenticationDetails checkAuthentication(HttpServletRequest request) {
    // perform some sort of authentication check ...

    var details = new AuthenticationDetails();
    details.setUserName("user1");

    return details;
  }
}
