package com.noted.admin.controllers;

import com.noted.admin.views.AnotherView;
import com.noted.auth.AuthenticationService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnotherController {
  @Autowired private AuthenticationService authenticationService;

  @RequestMapping("/another")
  @ResponseBody
  public AnotherView anotherEndpoint(HttpServletRequest request) {
    authenticationService.checkAuthentication(request);

    var anotherView = new AnotherView();
    anotherView.setDetails("some extra details");

    return anotherView;
  }
}
