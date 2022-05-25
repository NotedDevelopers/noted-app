package com.noted.admin.controllers;

import com.noted.admin.views.IndexView;
import com.noted.auth.AuthenticationDetails;
import com.noted.auth.AuthenticationService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
  @Autowired private AuthenticationService authenticationService;

  @ResponseBody
  @RequestMapping("/")
  public IndexView index(HttpServletRequest request) {
    var authenticationDetails = authenticationService.checkAuthentication(request);

    // do controller actions ...

    var view = new IndexView();
    view.setUserName(authenticationDetails.getUserName());
    view.setGreeting("Welcome to Noted Admin");
    return view;
  }
}
