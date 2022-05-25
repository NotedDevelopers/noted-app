package com.noted.api.index;

import com.noted.auth.AuthenticationService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
  @Autowired private AuthenticationService authenticationService;

  @RequestMapping("/")
  @ResponseBody
  public IndexView index(HttpServletRequest request) {
    authenticationService.checkAuthentication(request);

    var view = new IndexView();
    view.setDetails("details");

    return view;
  }
}
