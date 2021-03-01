package org.geektimes.projects.user.web.controller;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.service.UserService;
import org.geektimes.projects.user.service.UserServiceImpl;
import org.geektimes.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("")
public class RegisterdController implements PageController {

    UserService userService = new UserServiceImpl();

    @Override
    @POST
    @Path("/registerd")
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        User user = new User();
        user.setName(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        user.setId(Long.valueOf(user.getName().hashCode()));
        if(user.getName().equals("") || user.getPassword().equals("") || !userService.register(user)) {
            return "register_fail.jsp";
        }
        else {
            return "register_success.jsp";
        }
    }

}
