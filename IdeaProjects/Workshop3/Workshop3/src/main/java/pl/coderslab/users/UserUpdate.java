package pl.coderslab.users;

import pl.coderslab.utils.User;
import pl.coderslab.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "UserUpdate", value = "/userUpdate")
public class UserUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String id = request.getParameter("id");
        int intID = Integer.parseInt(id);
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName(userName);
        user.setEmail(email);
        user.setPassword(password);
        user.setId(intID);
        try {
            userDao.update(user);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        response.sendRedirect("/list");
    }
}