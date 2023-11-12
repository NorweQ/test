package pl.coderslab.users;

import pl.coderslab.utils.User;
import pl.coderslab.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "UserDelateId", value = "/userDelateId")
public class UserDelateId extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        int intId = Integer.parseInt(id);
        try {
            User user = UserDao.read(intId);
            request.setAttribute("user", user);
            getServletContext().getRequestDispatcher("/users/userDId.jsp").forward(request,response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}