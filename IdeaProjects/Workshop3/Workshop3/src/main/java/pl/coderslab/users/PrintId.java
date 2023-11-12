package pl.coderslab.users;

import pl.coderslab.utils.User;
import pl.coderslab.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "PrintId", value = "/printId")
public class PrintId extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        if (id == null || id.isEmpty()){
            response.sendRedirect("/users/findId.jsp");
        }else {
            int intId = Integer.parseInt(id);
            try {
                User user = UserDao.read(intId);
                if (user == null){
                    User user1 = new User();
                    user1.setUserName("Brak imienia");
                    user1.setEmail("Brak Email");
                    user1.setPassword("Brak hasła");
                    request.setAttribute("user", user1);
                    getServletContext().getRequestDispatcher("/users/findId2.jsp").forward(request,response);
                }
                request.setAttribute("user", user);
                getServletContext().getRequestDispatcher("/users/findId2.jsp").forward(request,response);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}