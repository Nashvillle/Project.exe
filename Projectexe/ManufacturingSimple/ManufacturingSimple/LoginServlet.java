
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        if ("admin".equals(user) && "admin".equals(pass)) {
            HttpSession session = request.getSession();
            session.setAttribute("admin", user);
            response.sendRedirect("dashboard");
        } else {
            response.getWriter().println("Invalid Login!");
        }
    }
}
