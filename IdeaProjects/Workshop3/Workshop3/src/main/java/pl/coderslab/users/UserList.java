package pl.coderslab.users;

import pl.coderslab.utils.User;
import pl.coderslab.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet(name = "UserList", value = "/list")
public class UserList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        try {
            User[] user = userDao.findAll();
//            response.getWriter().println(Arrays.toString(user));
            request.setAttribute("user", user);
            getServletContext().getRequestDispatcher("/users/printAll.jsp").forward(request,response);
//        response.getWriter().println(User.getId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        response.sendRedirect("/users/printAll.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}