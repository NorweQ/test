package pl.coderslab.users;

import pl.coderslab.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "UserDelete", value = "/userDelete")
public class UserDelete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        UserDao userDao = new UserDao();
        int intId = Integer.parseInt(id);

        try {
            userDao.delete(intId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        response.sendRedirect("/list");
//        getServletContext().getRequestDispatcher("/users/printAll.jsp").forward(request,response);

    }
}