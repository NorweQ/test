package pl.coderslab.users;

import pl.coderslab.utils.User;
import pl.coderslab.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddUser", value = "/addUser")
public class AddUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName(userName);
        user.setEmail(email);
        user.setPassword(password);
        userDao.create(user);
        request.setAttribute("user", user);
        response.sendRedirect("/list");

    }
}