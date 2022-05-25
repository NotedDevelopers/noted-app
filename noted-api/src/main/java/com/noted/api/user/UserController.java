package com.noted.api.user;

import com.noted.auth.AuthenticationService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
  @Autowired private AuthenticationService authenticationService;

  @RequestMapping(value = "/user/add", method = RequestMethod.POST)
  @ResponseBody
  public UserView create(HttpServletRequest request, @RequestBody UserView userView) {
    authenticationService.checkAuthentication(request);

    // perform create operation ...

    return new UserView();
  }

  @RequestMapping("/user")
  @ResponseBody
  public UserView read(HttpServletRequest request, @RequestParam(required = false) Long id) {
    authenticationService.checkAuthentication(request);

    // perform read operation ...

    var view = new UserView();
    view.setId(id);
    return view;
  }

  @RequestMapping(value = "/user/update", method = RequestMethod.POST)
  @ResponseBody
  public UserView update(HttpServletRequest request, @RequestParam Long id, UserView userView) {
    authenticationService.checkAuthentication(request);

    // perform update operation ...

    return new UserView();
  }

  @RequestMapping(value = "/user/delete", method = RequestMethod.POST)
  @ResponseBody
  public UserView delete(HttpServletRequest request, @RequestParam Long id) {
    authenticationService.checkAuthentication(request);

    // perform delete operation ...

    return new UserView();
  }
}
