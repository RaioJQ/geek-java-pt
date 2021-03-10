package org.geektimes.projects.user.web.controller;

import org.geektimes.context.ComponentContext;
import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.service.UserService;
import org.geektimes.projects.user.service.UserServiceImpl;
import org.geektimes.web.mvc.controller.PageController;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("")
public class RegisterdController implements PageController {

    private UserService userService;

    @Override
    @POST
    @Path("/registerd")
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        ComponentContext context = (ComponentContext) request.getServletContext()
                .getAttribute("org.geektimes.context.ComponentContext");
        userService = context.getComponent("bean/UserService");
        User user = new User();
        user.setName(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        user.setEmail(request.getParameter("email"));
        user.setPhoneNumber(request.getParameter("phone"));
        if(user.getName().equals("") || user.getPassword().equals("") || !userService.register(user)) {
            return "register_fail.jsp";
        }
        else {
            return "register_success.jsp";
        }
    }

}
